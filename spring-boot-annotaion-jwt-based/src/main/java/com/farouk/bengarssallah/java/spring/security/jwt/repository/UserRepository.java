package com.farouk.bengarssallah.java.spring.security.jwt.repository;

import org.springframework.data.jpa.repository.Query;

import com.farouk.bengarssallah.java.spring.security.jwt.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>
{
    @Query("SELECT u FROM User u WHERE u.username = ?1")
    User findByUsername(final String username);
}