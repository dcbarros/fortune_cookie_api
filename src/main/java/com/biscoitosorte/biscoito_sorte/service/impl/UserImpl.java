package com.biscoitosorte.biscoito_sorte.service.impl;

import org.springframework.stereotype.Service;

import com.biscoitosorte.biscoito_sorte.dto.request.UserCreateRequest;
import com.biscoitosorte.biscoito_sorte.exception.UserDadosInvalidosException;
import com.biscoitosorte.biscoito_sorte.repository.UserRepository;
import com.biscoitosorte.biscoito_sorte.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserImpl implements UserService{
    
    private final UserRepository userRepository;

    public void saveNewUser(UserCreateRequest request){
        if(request == null) throw new UserDadosInvalidosException("usuário");
        if(request.getEmail().isBlank()) throw new UserDadosInvalidosException("email");
        if(request.getName().isBlank()) throw new UserDadosInvalidosException("nome");
        if(request.getPassword().isBlank()) throw new UserDadosInvalidosException("senha");
        userRepository.save(request.dtoToModel());
    }

}
