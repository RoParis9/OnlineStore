package com.br.Rodrigo.OnlineStore.Repositories;

import com.br.Rodrigo.OnlineStore.Domain.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
    
	
}
