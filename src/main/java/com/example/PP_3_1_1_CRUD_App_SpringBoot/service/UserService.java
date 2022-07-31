package com.example.PP_3_1_1_CRUD_App_SpringBoot.service;

import com.example.PP_3_1_1_CRUD_App_SpringBoot.model.User;

import java.util.List;

public interface UserService {
    void createUser(User user);
    void deleteUser(Long id);
    void updateUser(User user);
    User readUser(Long id);
    List<User> readAllUsers();
}
