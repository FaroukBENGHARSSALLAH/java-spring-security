package com.farouk.bengarssallah.java.spring.security.ouath.server.authorization.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.farouk.bengarssallah.java.spring.security.ouath.server.authorization.domain.UserRole;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long>{
	
    @Query("SELECT u FROM UserRole u WHERE u.type = ?1")
    UserRole findByType(final String type);
    
}
