package com.br.Rodrigo.OnlineStore.Service.Interfaces;

import com.br.Rodrigo.OnlineStore.DTOS.UserLoginDTO;
import com.br.Rodrigo.OnlineStore.DTOS.UserRegisterDTO;

public interface IAuthenticationService {
    
    void registerUser(UserRegisterDTO userDTO);

    String loginUser(UserLoginDTO userDTO);
}
