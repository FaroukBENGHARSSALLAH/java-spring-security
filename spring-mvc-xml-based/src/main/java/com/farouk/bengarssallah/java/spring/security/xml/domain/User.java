package com.farouk.bengarssallah.java.spring.security.xml.domain;

import java.util.HashSet;
import java.util.Set;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
 
@Entity
@Table(name="TABLE_USER")
public class User {
 
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
 
    @Column(name="USERNAME", unique=true, nullable=false)
    private String username;
     
    @Column(name="PASSWORD", nullable=false)
    private String password;
         
    @Column(name="FULLNAME", nullable=false)
    private String fullname;
 
    @Column(name="EMAIL", nullable=false)
    private String email;
 
 
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "APP_USER_ROLE", 
             joinColumns = { @JoinColumn(name = "USER_ID") }, 
             inverseJoinColumns = { @JoinColumn(name = "USER_ROLE_ID") })
    private Set<UserRole> userProfiles = new HashSet<UserRole>();


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Set<UserRole> getUserProfiles() {
		return userProfiles;
	}


	public void setUserProfiles(Set<UserRole> userProfiles) {
		this.userProfiles = userProfiles;
	}
 
   
     
}