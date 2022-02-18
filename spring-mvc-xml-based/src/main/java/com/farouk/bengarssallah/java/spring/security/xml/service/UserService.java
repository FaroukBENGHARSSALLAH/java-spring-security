package com.farouk.bengarssallah.java.spring.security.xml.service;

import com.farouk.bengarssallah.java.spring.security.xml.domain.User;

public interface UserService {
 
    User findById(int id);
    User findBySso(String sso);
     
}
