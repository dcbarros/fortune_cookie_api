package com.biscoitosorte.biscoito_sorte.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {
    public static String encoder(String password){
        return new BCryptPasswordEncoder().encode(password);
    }
}
