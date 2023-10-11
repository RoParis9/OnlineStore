package com.br.Rodrigo.OnlineStore.Service;

import java.util.List;
import java.util.Optional;
import com.br.Rodrigo.OnlineStore.DTOS.updateProductDTO;
import com.br.Rodrigo.OnlineStore.Domain.Category;
import com.br.Rodrigo.OnlineStore.Domain.Product;
import com.br.Rodrigo.OnlineStore.Repositories.ProductRepository;
import com.br.Rodrigo.OnlineStore.Service.Interfaces.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ProductService implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        List<Product> productList = productRepository.findAll();
        return productList;
    }

    public List<Product> getAllByCategory(Category category) {
        List<Product> allProductsByCategory = productRepository.findByCategory(category);
        return allProductsByCategory;
    }

    public Product getProductByName(String name) {
        var productByName = productRepository.findByName(name);
        return productByName;
    }

    public Product updateProduct(updateProductDTO newProduct, Long id) {
        Optional<Product> existingProductOptional = productRepository.findById(id);

        if (existingProductOptional.isPresent()) {
            Product oldProduct = existingProductOptional.get();

            oldProduct.setPrice(newProduct.price());
            oldProduct.setQuantity(newProduct.quantity());
            oldProduct.setDescription(newProduct.description());

            return productRepository.save(oldProduct);

        } else {
            throw new EntityNotFoundException("Product not found");
        }

    }

    public void deleteProduct(Long productId) {
        if (productRepository.existsById(productId)) {
            productRepository.deleteById(productId);
        } else {
            throw new EntityNotFoundException("Product not found");
        }
    }

}
