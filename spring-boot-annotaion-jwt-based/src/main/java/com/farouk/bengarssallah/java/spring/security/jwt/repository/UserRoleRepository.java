package com.farouk.bengarssallah.java.spring.security.jwt.repository;

import org.springframework.data.jpa.repository.Query;

import com.farouk.bengarssallah.java.spring.security.jwt.domain.UserRole;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Long>
{
    @Query("SELECT u FROM UserRole u WHERE u.type = ?1")
    UserRole findByType(final String type);
}
