package com.farouk.bengarssallah.java.spring.security.xml.dao;

import com.farouk.bengarssallah.java.spring.security.xml.domain.User;

public interface UserDao {
	 
    User findById(int id);
    User findByUsername(String username);
     
}
