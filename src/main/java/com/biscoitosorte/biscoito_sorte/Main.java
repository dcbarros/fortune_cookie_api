package com.biscoitosorte.biscoito_sorte;

import java.security.interfaces.RSAPrivateKey;

import org.springframework.beans.factory.annotation.Value;

public class Main {

    @Value("${jwt.public.key}")
    private static RSAPrivateKey publicKeyStr;
    
    public static void main(String[] args) {
        System.out.println(publicKeyStr);
    }
}
