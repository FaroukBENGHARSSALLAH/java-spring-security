package com.farouk.bengarssallah.java.spring.security.annotation.controller;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.context.SecurityContextHolder;
import java.sql.ResultSet;
import java.util.Set;
import java.sql.Statement;
import java.sql.Connection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Date;
import java.sql.SQLException;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import org.springframework.ui.Model;

import com.farouk.bengarssallah.java.spring.security.annotation.domain.Account;
import com.farouk.bengarssallah.java.spring.security.annotation.domain.CheckingAccount;
import com.farouk.bengarssallah.java.spring.security.annotation.domain.Client;
import com.farouk.bengarssallah.java.spring.security.annotation.domain.SavingAccount;
import com.farouk.bengarssallah.java.spring.security.annotation.repository.AccountRepository;
import com.farouk.bengarssallah.java.spring.security.annotation.repository.ClientRepository;
import com.farouk.bengarssallah.java.spring.security.annotation.repository.UserRepository;
import com.farouk.bengarssallah.java.spring.security.annotation.repository.UserRoleRepository;
import com.farouk.bengarssallah.java.spring.security.annotation.rss.ABCNews;
import com.farouk.bengarssallah.java.spring.security.annotation.rss.ABCRSSExtractor;
import com.farouk.bengarssallah.java.spring.security.annotation.service.BankService;

import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController
{
      private UserRepository userRepository;
    @Autowired
    private UserRoleRepository userRoleRepository;

    
    @RequestMapping({ "/", "/welcome" })
    public String getHomePage(final Model model) {
        final List<ABCNews> list = this.getSliderImages();
        model.addAttribute("list", (Object)list);
        model.addAttribute("view", (Object)"welcome");
        model.addAttribute("loggeduser", (Object)this.getPrincipal());
        this.reset();
        return "welcome";
    }
    
   
    
   
    
    private String getPrincipal() {
        String userName = null;
        final Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            userName = ((UserDetails)principal).getUsername();
        }
        else {
            userName = principal.toString();
        }
        return userName;
    }
}
 