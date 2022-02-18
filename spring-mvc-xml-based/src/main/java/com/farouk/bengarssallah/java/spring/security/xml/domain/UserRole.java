package com.farouk.bengarssallah.java.spring.security.xml.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="USER_ROLE")
public class UserRole {
 
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id; 
 
    @Column(name="TYPE", length=15, unique=true, nullable=false)
    private String type;
     
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getType() {
        return type;
    }
 
    public void setType(String type) {
        this.type = type;
    }
 
 
  
     
 
}