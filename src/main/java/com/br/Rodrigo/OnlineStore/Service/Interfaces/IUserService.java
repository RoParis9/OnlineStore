package com.br.Rodrigo.OnlineStore.Service.Interfaces;

public interface IUserService {
    
    void deleteUser(Long userId);
    void updateAdress(Long userId, String newAdress);
    void updateEmail(Long userId, String email);
    void passwordReset(Long userId, String newPassword, String  currentPassword);
	
}
