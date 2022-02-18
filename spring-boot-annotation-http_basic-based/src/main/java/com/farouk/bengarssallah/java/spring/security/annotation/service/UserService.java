package com.farouk.bengarssallah.java.spring.security.annotation.service;

import java.util.List;

import com.farouk.bengarssallah.java.spring.security.annotation.domain.User;

public interface UserService
{
    void addUser(final User p0);
    
    void editUser(final User p0);
    
    void deleteUser(final long p0);
    
    User findById(final long p0);
    
    User findByLogin(final String p0);
    
    List<User> findAll();
}

