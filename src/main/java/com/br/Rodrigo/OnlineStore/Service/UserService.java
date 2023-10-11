package com.br.Rodrigo.OnlineStore.Service;

import java.util.Optional;

import com.br.Rodrigo.OnlineStore.Domain.User;
import com.br.Rodrigo.OnlineStore.Repositories.UserRepository;
import com.br.Rodrigo.OnlineStore.Service.Interfaces.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void deleteUser(Long userId) {
        try {
            Optional<User> user = userRepository.findById(userId);
            if (user == null) {
                throw new IllegalArgumentException("User not found");
            }
            userRepository.delete(user.get());
        } catch (Exception e) {
        }
    }

    public void updateAdress(Long userId, String newAdress) {

        try {
            Optional<User> userOptional = userRepository.findById(userId);

            if (userOptional.isPresent()) {
                User user = userOptional.get();
                user.setAdress(newAdress);
                userRepository.save(user);
            }

        } catch (Exception e) {
            throw new RuntimeException("Couldn`t update the adress");
        }
    }

    public void updateEmail(Long userId, String email) {

        try {
            Optional<User> userOptional = userRepository.findById(userId);

            if (userOptional.isPresent()) {
                User user = userOptional.get();
                user.setEmail(email);
                userRepository.save(user);
            }

        } catch (Exception e) {
            throw new RuntimeException("Couldn`t update the adress");
        }
    }

    public void passwordReset(Long userId, String newPassword, String currentPassword) {

        Optional<User> userOptional = userRepository.findById(userId);
        User user = userOptional.get();

        if (user == null) {
            throw new IllegalArgumentException("User not found");
        }
        ;

        if (!passwordEncoder.matches(currentPassword, user.getPassword())) {
            throw new IllegalArgumentException("Current password is incorrect");
        }

        String encodedNewPassword = passwordEncoder.encode(newPassword);

        user.setPassword(encodedNewPassword);

        userRepository.save(user);
    }
}
