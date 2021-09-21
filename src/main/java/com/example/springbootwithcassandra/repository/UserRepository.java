package com.example.springbootwithcassandra.repository;

import com.example.springbootwithcassandra.model.User;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface UserRepository extends CassandraRepository<User,Integer> {
}
