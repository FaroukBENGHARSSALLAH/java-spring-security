package com.farouk.bengarssallah.java.spring.security.annotation.implementation;

import java.util.List;
import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import com.farouk.bengarssallah.java.spring.security.annotation.domain.UserRole;
import com.farouk.bengarssallah.java.spring.security.annotation.repository.UserRoleRepository;
import com.farouk.bengarssallah.java.spring.security.annotation.service.UserRoleService;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

@Service("userRoleService")
@Transactional
public class UserRoleServiceImpl implements UserRoleService
{
    @Autowired
    UserRoleRepository userRoleRepository;
    
    @Override
    public UserRole findById(final long id) {
        return (UserRole)this.userRoleRepository.findOne((Serializable)id);
    }
    
    @Override
    public UserRole findByType(final String type) {
        return this.userRoleRepository.findByType(type);
    }
    
    @Override
    public List<UserRole> findAll() {
        return (List<UserRole>)this.userRoleRepository.findAll();
    }
}
