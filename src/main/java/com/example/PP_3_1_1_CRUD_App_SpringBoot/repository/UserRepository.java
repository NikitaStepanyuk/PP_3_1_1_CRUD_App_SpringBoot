package com.example.PP_3_1_1_CRUD_App_SpringBoot.repository;

import com.example.PP_3_1_1_CRUD_App_SpringBoot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {
    void createUser(User user);

    void deleteUser(Long id);

    void updateUser(User user);

    User readUser(Long id);

    List<User> readAllUsers();
}
