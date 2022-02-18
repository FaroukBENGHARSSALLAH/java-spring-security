package com.farouk.bengarssallah.java.spring.security.ouath.server.authorization.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.farouk.bengarssallah.java.spring.security.ouath.server.authorization.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
    @Query("SELECT u FROM User u WHERE u.username = ?1")
    User findByUsername(final String username);
    
}
