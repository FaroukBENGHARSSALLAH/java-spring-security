package com.farouk.bengarssallah.java.spring.security.annotation.implementation;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import com.farouk.bengarssallah.java.spring.security.annotation.domain.User;
import com.farouk.bengarssallah.java.spring.security.annotation.repository.UserRepository;
import com.farouk.bengarssallah.java.spring.security.annotation.service.UserService;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserRepository userRepository;
    
    @Transactional
    @Override
    public void addUser(final User user) {
        this.userRepository.save(user);
    }
    
    @Transactional
    @Override
    public void editUser(final User user) {
        this.userRepository.save(user);
    }
    
    @Transactional
    @Override
    public void deleteUser(final long id) {
        this.userRepository.delete(id);
    }
    
    @Override
    public User findById(final long id) {
        return (User)this.userRepository.findOne(id);
    }
    
    @Override
    public User findByLogin(final String login) {
        final User user = this.userRepository.findByLogin(login);
        return user;
    }
    
    @Override
    public List<User> findAll() {
        return (List<User>)this.userRepository.findAll();
    }
}
