package com.br.Rodrigo.OnlineStore.Controllers;

import com.br.Rodrigo.OnlineStore.DTOS.UserLoginDTO;
import com.br.Rodrigo.OnlineStore.DTOS.UserRegisterDTO;
import com.br.Rodrigo.OnlineStore.Service.AuthenticationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/auth")
public class AuthenticationController {
    
    @Autowired
    private AuthenticationService authenticationService; 

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserRegisterDTO userDTO){
        authenticationService.registerUser(userDTO);
        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserLoginDTO userDTO){
        String token = authenticationService.loginUser(userDTO);
        return ResponseEntity.ok(token);
    }
	
}
