package com.example.PP_3_1_1_CRUD_App_SpringBoot.service;

import com.example.PP_3_1_1_CRUD_App_SpringBoot.model.User;
import com.example.PP_3_1_1_CRUD_App_SpringBoot.repository.UserRepository;
import com.example.PP_3_1_1_CRUD_App_SpringBoot.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserRepositoryImpl userRepository;

    @Autowired
    public UserServiceImp(UserRepositoryImpl userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public List<User> readAllUsers() {
        return userRepository.readAllUsers();
    }

    @Override
    @Transactional
    public User readUser(Long id) {
        return userRepository.readUser(id);
    }

    @Override
    @Transactional
    public void createUser(User user) {
        userRepository.createUser(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        userRepository.deleteUser(id);
    }

}
