package com.farouk.bengarssallah.java.spring.security.ouath.server.authorization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import com.farouk.bengarssallah.java.spring.security.ouath.server.authorization.domain.User;
import com.farouk.bengarssallah.java.spring.security.ouath.server.authorization.domain.UserRole;
import com.farouk.bengarssallah.java.spring.security.ouath.server.authorization.repository.UserRepository;
import com.farouk.bengarssallah.java.spring.security.ouath.server.authorization.repository.UserRoleRepository;

@EnableResourceServer
@ComponentScan(value={"com.farouk.bengarssallah.java.spring.security.ouath.server.authorization"})
@EntityScan(value={"com.farouk.bengarssallah.java.spring.security.ouath.server.authorization.domain"})
@EnableJpaRepositories(value={"com.farouk.bengarssallah.java.spring.security.ouath.server.authorization.repository"})
@SpringBootApplication
public class AuthorizationServerApplication implements CommandLineRunner {
	
	    @Autowired
	    private UserRepository userRepository;
	    @Autowired
	    private UserRoleRepository userRoleRepository;

	public static void main(String[] args) {
		SpringApplication.run(AuthorizationServerApplication.class, args);
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
