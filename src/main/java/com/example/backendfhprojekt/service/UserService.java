package com.example.backendfhprojekt.service;

import com.example.backendfhprojekt.model.User;
import com.example.backendfhprojekt.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public <S extends User> S save(S entity) {
        return userRepository.save(entity);
    }
}
