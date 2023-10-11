package com.br.Rodrigo.OnlineStore.Controllers;

import java.util.List;

import com.br.Rodrigo.OnlineStore.DTOS.updateProductDTO;
import com.br.Rodrigo.OnlineStore.Domain.Product;
import com.br.Rodrigo.OnlineStore.Service.Interfaces.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        var allProducts = productService.getAllProducts();
        return ResponseEntity.ok(allProducts);
    }

    @GetMapping("/categories/{categoryName}")
    public ResponseEntity<List<Product>> getAllByCategory(@PathVariable String categoryName) {
        
    }

    @GetMapping("/name/{productName}")
    public ResponseEntity<Product> getProductByName(@PathVariable String productName) {
        Product singleProduct = productService.getProductByName(productName);
        return ResponseEntity.ok(singleProduct);
    }

    @PutMapping()
    public ResponseEntity updateProduct(@RequestBody updateProductDTO newProduct, @PathVariable Long id) {
        var updatedProduct = productService.updateProduct(newProduct, id);
        return ResponseEntity.ok(updatedProduct);
    }

    @DeleteMapping("/{productId}")
    public void deleteProduct(@PathVariable Long productId) {
        productService.deleteProduct(productId);
    }
}
