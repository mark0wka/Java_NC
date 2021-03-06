package com.mark0wka.repository;

import com.mark0wka.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByFirstNameAndLastName(String firstName, String lastName);
}
