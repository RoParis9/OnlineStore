package com.br.Rodrigo.OnlineStore.Repositories;

import com.br.Rodrigo.OnlineStore.Domain.Cart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Long, Cart>{
    
	
}
