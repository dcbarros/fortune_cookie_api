package com.biscoitosorte.biscoito_sorte.dto.request;


import com.biscoitosorte.biscoito_sorte.model.User;
import com.biscoitosorte.biscoito_sorte.utils.PasswordUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateRequest {
    private String name;
    private String password;
    private String email;

    public User dtoToModel(){
        return new User(name, PasswordUtils.encoder(password), email);
    }
}
