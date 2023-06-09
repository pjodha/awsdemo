package com.prakash.awsdemo.dao;

import com.prakash.awsdemo.dto.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByFirstName(String firstName);
}
