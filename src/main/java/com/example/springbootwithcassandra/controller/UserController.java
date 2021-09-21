package com.example.springbootwithcassandra.controller;

import com.example.springbootwithcassandra.model.User;
import com.example.springbootwithcassandra.model.dto.UserDTO;
import com.example.springbootwithcassandra.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/cassandra")
public class UserController {

    final UserService userService;

    @PostMapping("/user")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUser(@PathVariable("id") int id){
        return userService.getUser(id);
    }


    @GetMapping("/users")

      public List<User> getUsers(){
        return userService.getUsers();
    }
    @PutMapping("/user/{id}")
    public User updateUser(@PathVariable("id") int id,@RequestBody UserDTO userDTO){
        return userService.updateUser(id,userDTO);
    }
    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable("id") int id){
        userService.deleteUser(id);
    }

}
