package com.br.Rodrigo.OnlineStore.Controllers;

import com.br.Rodrigo.OnlineStore.Service.Interfaces.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @DeleteMapping("/delete")
    public ResponseEntity deleteUser(Long userId) {
        userService.deleteUser(userId);
        return ResponseEntity.ok("password deleted");
    }

    @PatchMapping("/update/adress")
    public ResponseEntity updateAdress(Long userId, String newAdress) {
        userService.updateAdress(userId, newAdress);
        return ResponseEntity.ok("adress updated");
    }

    @PatchMapping("/update/email")
    public ResponseEntity updateEmail(Long userId, String email) {
        userService.updateEmail(userId, email);
        return ResponseEntity.ok("email updated");
    }

    @PatchMapping("/update/password")
    public ResponseEntity passwordReset(Long userId, String newPassword, String currentPassword) {
        userService.passwordReset(userId, newPassword, currentPassword);
        return ResponseEntity.ok("email updated");
    }
}
