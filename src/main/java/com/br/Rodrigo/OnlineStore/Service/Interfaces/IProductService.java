package com.br.Rodrigo.OnlineStore.Service.Interfaces;

import java.util.List;

import com.br.Rodrigo.OnlineStore.DTOS.updateProductDTO;
import com.br.Rodrigo.OnlineStore.Domain.Category;
import com.br.Rodrigo.OnlineStore.Domain.Product;

public interface IProductService {

    List<Product> getAllProducts();

    List<Product> getAllByCategory(Category name);

    Product getProductByName(String name);

    Product updateProduct(updateProductDTO newProduct, Long id);

    void deleteProduct(Long productId);
}
