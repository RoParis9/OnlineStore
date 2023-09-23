package com.br.Rodrigo.OnlineStore.Repositories;

import com.br.Rodrigo.OnlineStore.Domain.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
    
	
}
