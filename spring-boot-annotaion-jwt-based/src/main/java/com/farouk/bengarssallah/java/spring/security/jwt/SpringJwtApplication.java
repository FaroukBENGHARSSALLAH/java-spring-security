package com.farouk.bengarssallah.java.spring.security.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCrypt;

import com.farouk.bengarssallah.java.spring.security.jwt.domain.User;
import com.farouk.bengarssallah.java.spring.security.jwt.domain.UserRole;
import com.farouk.bengarssallah.java.spring.security.jwt.repository.UserRepository;
import com.farouk.bengarssallah.java.spring.security.jwt.repository.UserRoleRepository;


@SpringBootApplication
public class SpringJwtApplication implements CommandLineRunner  {
	
	@Autowired 
	private UserRepository userRepository;
	
	@Autowired 
	private UserRoleRepository userRoleRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringJwtApplication.class, args);
	}
	
	
	public void run(String ... args) {
        System.out.println("starting");
        UserRole role = new UserRole();
        role.setType("ADMIN");
        this.userRoleRepository.save(role);
        User user = new User();
        user.setUsername("admin");
        user.setPassword(BCrypt.hashpw((String)"admin", (String)BCrypt.gensalt((int)10)));
        this.userRoleRepository.save(role);
        user.getUserRoles().add(role);
        this.userRepository.save(user);
    }
}