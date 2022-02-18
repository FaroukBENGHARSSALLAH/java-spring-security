package com.farouk.bengarssallah.java.spring.security.ouath.server.authorization.domain;

import java.io.Serializable;

public enum UserRoleType implements Serializable
{
    USER("USER");
	
    String userProfileType;
    
    private UserRoleType(final String userProfileType) {
        this.userProfileType = userProfileType;
    }
    
    public String getUserProfileType() {
        return this.userProfileType;
    }
}