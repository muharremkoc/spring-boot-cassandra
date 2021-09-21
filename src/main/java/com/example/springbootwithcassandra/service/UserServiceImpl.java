package com.example.springbootwithcassandra.service;

import com.example.springbootwithcassandra.exception.UserAlreadyExistsException;
import com.example.springbootwithcassandra.exception.UserNotFoundException;
import com.example.springbootwithcassandra.model.User;
import com.example.springbootwithcassandra.model.dto.UserDTO;
import com.example.springbootwithcassandra.repository.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserServiceImpl implements UserService {

    final UserRepository userRepository;

    @Override
    public User createUser(User user) {
        Optional<User> optionalUser = userRepository.findById(user.getId());

        if (optionalUser.isPresent()) {
            throw new UserAlreadyExistsException();
        }


        return userRepository.save(user);
    }

    @Override
    public User updateUser(int id, UserDTO userDTO) {
        User newUser = userRepository.findById(id).orElseThrow(UserNotFoundException::new);
        newUser.setFirstName(userDTO.getFirstName());
        newUser.setLastName(userDTO.getLastName());
        newUser.setAge(userDTO.getAge());


        return userRepository.save(newUser);
    }

    @Override
    public Optional<User> getUser(int id) {
        Optional<User> emp = userRepository.findById(id);
        return emp;
    }

    @Override
    public List<User> getUsers() {
        List<User> streamUser = userRepository.findAll();
        return streamUser;
    }

    @Override
    public void deleteUser(int id) {
        User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException());


        userRepository.delete(user);
    }
}
