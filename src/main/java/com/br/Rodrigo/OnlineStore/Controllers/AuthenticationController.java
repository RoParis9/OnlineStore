package com.br.Rodrigo.OnlineStore.Controllers;

import com.br.Rodrigo.OnlineStore.DTOS.UserLoginDTO;
import com.br.Rodrigo.OnlineStore.DTOS.UserRegisterDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
    
    @Autowired
    private final AuthenticationService authenticationService; 

    public ResponseEntity<T> registerUser(@RequestBody UserRegisterDTO userDTO){
        authenticationService.register(userDTO);
        return ResponseEntity.ok("User registered successfully");
    }

    public ResponseEntity<?> authenticateUser(@RequestBody UserLoginDTO userDTO){
        authenticationService.authenticate(userDTO);
        return ResponseEntity.ok("User authenticated");
    }
	
}
