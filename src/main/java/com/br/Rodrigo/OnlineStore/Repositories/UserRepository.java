package com.br.Rodrigo.OnlineStore.Repositories;

import com.br.Rodrigo.OnlineStore.Domain.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Long, User>{
    
	
}
