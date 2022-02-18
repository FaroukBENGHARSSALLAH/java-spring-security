package com.farouk.bengarssallah.java.spring.security.annotation.service;

import java.util.List;

import com.farouk.bengarssallah.java.spring.security.annotation.domain.UserRole;

public interface UserRoleService
{
    UserRole findById(final long p0);
    
    UserRole findByType(final String p0);
    
    List<UserRole> findAll();
}