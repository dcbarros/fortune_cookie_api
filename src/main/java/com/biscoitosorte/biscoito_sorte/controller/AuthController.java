package com.biscoitosorte.biscoito_sorte.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biscoitosorte.biscoito_sorte.dto.request.LoginRequest;
import com.biscoitosorte.biscoito_sorte.dto.response.AuthResponse;
import com.biscoitosorte.biscoito_sorte.security.service.AuthService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth/api/v1")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public AuthResponse authenticate(@RequestBody LoginRequest loginRequest) {
        return authService.authenticate(loginRequest);
    }
}
