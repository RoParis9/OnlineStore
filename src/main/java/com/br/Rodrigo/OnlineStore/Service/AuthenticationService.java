package com.br.Rodrigo.OnlineStore.Service;


import com.br.Rodrigo.OnlineStore.DTOS.UserLoginDTO;
import com.br.Rodrigo.OnlineStore.DTOS.UserRegisterDTO;
import com.br.Rodrigo.OnlineStore.Domain.User;
import com.br.Rodrigo.OnlineStore.Repositories.UserRepository;
import com.br.Rodrigo.OnlineStore.Service.Interfaces.IAuthenticationService;
import com.br.Rodrigo.OnlineStore.config.TokenService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService implements IAuthenticationService{

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private AuthenticationManager authenticationManager;

    public void registerUser(UserRegisterDTO userDTO){

        if (this.userRepository.findByEmail(userDTO.email()) != null) {
            throw new RuntimeException("This user already exists");
        }

        String encryptedPassword = passwordEncoder.encode(userDTO.password());
        User newUser = mapper.map(userDTO, User.class);
        newUser.setPassword(encryptedPassword);
        userRepository.save(newUser);
    }

    public String loginUser(UserLoginDTO userDTO){

        if (userDTO.email().isEmpty()) {
            throw new RuntimeException("Name cannot be empty");
        }

        if (userDTO.password().isEmpty()) {
            throw new RuntimeException("Password cannot be empty");
        }

        try {

            var usernamePassword = new UsernamePasswordAuthenticationToken(userDTO.email(), userDTO.password());
            var auth = this.authenticationManager.authenticate(usernamePassword);
            var token = tokenService.generateToken((User) auth.getPrincipal());
            return token;

        } catch (Exception error) {
            throw new RuntimeException("Couldn`t save this user");
        }
    }
    
	
}
