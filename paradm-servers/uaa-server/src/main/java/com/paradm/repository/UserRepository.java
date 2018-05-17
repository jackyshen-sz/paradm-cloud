package com.paradm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paradm.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

  User findByUsername(String username);
}
