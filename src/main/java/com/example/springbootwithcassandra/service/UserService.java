package com.example.springbootwithcassandra.service;

import com.example.springbootwithcassandra.model.User;
import com.example.springbootwithcassandra.model.dto.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(User user);
    User updateUser(int id, UserDTO userDTO);
    Optional<User> getUser(int id);
    List<User> getUsers();
    void  deleteUser(int id);

}
