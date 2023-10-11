package com.br.Rodrigo.OnlineStore.Repositories;

import com.br.Rodrigo.OnlineStore.Domain.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    String findByEmail(String email);

    UserDetails findByLogin(String login);

}
