package com.biscoitosorte.biscoito_sorte.security.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.biscoitosorte.biscoito_sorte.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailsService{

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
      return userRepository.findByEmail(username)
          .map(user -> new UserAuth(user))
          .orElseThrow(
              () -> new UsernameNotFoundException("User Not Found with username: " + username));
    }
    
}
