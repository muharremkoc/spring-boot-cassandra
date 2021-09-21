package com.example.springbootwithcassandra.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Table(value = "userlist")
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    @PrimaryKey
    int id;

    @NonNull
    @Length(min = 2,max = 100)

    String firstName;

    @NonNull
    @Length(min = 2,max = 100)
    String lastName;

    @NonNull
    @Size(min = 18)
    int age;

    @Email
    String email;





}
