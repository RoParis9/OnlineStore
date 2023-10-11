package com.br.Rodrigo.OnlineStore.Repositories;

import java.util.List;

import com.br.Rodrigo.OnlineStore.Domain.Category;
import com.br.Rodrigo.OnlineStore.Domain.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    List<Product> findByCategory(Category category);

    Product findByName(String name);
}
