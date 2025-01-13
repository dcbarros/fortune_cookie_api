package com.biscoitosorte.biscoito_sorte.security.service;

import org.springframework.stereotype.Service;

import com.biscoitosorte.biscoito_sorte.dto.request.LoginRequest;
import com.biscoitosorte.biscoito_sorte.dto.response.AuthResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public AuthResponse authenticate(LoginRequest loginRequest) {
        // Autentica o usuário com e-mail e senha
        Authentication authentication = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(
                loginRequest.getEmail(),
                loginRequest.getPassword()
            )
        );

        // Gera o token JWT
        String token = jwtService.generateToken(authentication);
        return new AuthResponse(token);
    }
}
