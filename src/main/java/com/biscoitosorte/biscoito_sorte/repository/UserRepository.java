package com.biscoitosorte.biscoito_sorte.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biscoitosorte.biscoito_sorte.model.User;

public interface UserRepository  extends JpaRepository<User,Long>{
    Optional<User> findByEmail(String email);
}
