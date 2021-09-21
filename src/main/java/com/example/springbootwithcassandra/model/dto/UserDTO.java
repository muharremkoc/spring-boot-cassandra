package com.example.springbootwithcassandra.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    @NonNull
    String firstName;

    @NonNull
    String lastName;

    @NonNull
    int age;
}
