package com.farouk.bengarssallah.java.spring.security.ouath.server.authorization.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.farouk.bengarssallah.java.spring.security.ouath.server.authorization.domain.User;
import com.farouk.bengarssallah.java.spring.security.ouath.server.authorization.domain.UserRole;
import com.farouk.bengarssallah.java.spring.security.ouath.server.authorization.repository.UserRepository;

@Service
public class CustomDetailsService implements UserDetailsService {
   
   @Autowired
   private UserRepository userRepository;

   @Transactional(readOnly = true)
   public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
       final User user =  this.userRepository.findByUsername(username);
       if (user == null) {
           throw new UsernameNotFoundException("Username not found");
       }
       return ((UserDetails)new UserDetails(user.getUsername(), user.getPassword(), true, true, true, true, this.getGrantedAuthorities(user)));
   }
   
   private List<GrantedAuthority> getGrantedAuthorities(final User user) {
       final List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
       for (final UserRole UserRole : user.getUserRoles()) {
           authorities.add((GrantedAuthority)new SimpleGrantedAuthority("ROLE_" + UserRole.getType()));
       }
       return authorities;
   }
   
} 