package com.biscoitosorte.biscoito_sorte.service;

import com.biscoitosorte.biscoito_sorte.dto.request.UserCreateRequest;

public interface UserService {
    public void saveNewUser(UserCreateRequest request);
}
