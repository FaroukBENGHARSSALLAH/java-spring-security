package com.farouk.bengarssallah.java.spring.security.annotation;

import com.farouk.bengarssallah.java.spring.security.annotation.domain.User;
import com.farouk.bengarssallah.java.spring.security.annotation.domain.UserRole;
import com.farouk.bengarssallah.java.spring.security.annotation.repository.UserRepository;
import com.farouk.bengarssallah.java.spring.security.annotation.repository.UserRoleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCrypt;

@ComponentScan(value={"com.farouk.bengarssallah.java.spring.security.annotation"})
@EntityScan(value={"com.farouk.bengarssallah.java.spring.security.annotation.domain"})
@EnableJpaRepositories(value={"com.farouk.bengarssallah.java.spring.security.annotation.repository"})
@SpringBootApplication
public class Application extends SpringBootServletInitializer implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserRoleRepository userRoleRepository;

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(new Class[]{Application.class});
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, (String[])args);
    }

    public void run(String ... args) {
        System.out.println("starting");
        UserRole role = new UserRole();
        role.setType("ADMIN");
        this.userRoleRepository.save(role);
        User user = new User();
        user.setLogin("admin");
        user.setPassword(BCrypt.hashpw((String)"admin", (String)BCrypt.gensalt((int)10)));
        this.userRoleRepository.save(role);
        user.getUserRoles().add(role);
        this.userRepository.save(user);
    }
}