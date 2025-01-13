package com.biscoitosorte.biscoito_sorte.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biscoitosorte.biscoito_sorte.dto.request.UserCreateRequest;
import com.biscoitosorte.biscoito_sorte.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/users/api/v1")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/signin")
    public void signIn(@RequestBody UserCreateRequest request){
        userService.saveNewUser(request);
    }
}
