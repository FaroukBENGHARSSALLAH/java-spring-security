package com.farouk.bengarssallah.java.spring.security.ouath.server.authorization.domain;

import java.util.HashSet;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Table(name = "table_user")
public class User extends AEntity implements Serializable
{
    @Column(name = "username", unique = true, nullable = false)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = { @JoinColumn(name = "user_id") }, inverseJoinColumns = { @JoinColumn(name = "role_id") })
    private Set<UserRole> userRoles;
    
    public User() {
        this.userRoles = new HashSet<UserRole>();
    }
  
    
    public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
        return this.password;
    }
    
    public void setPassword(final String password) {
        this.password = password;
    }
    
    public Set<UserRole> getUserRoles() {
        return this.userRoles;
    }
    
    public void setUserRoles(final Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }
}
