package com.farouk.bengarssallah.java.spring.security.xml.domain;

public enum UserRoleTypes {
    USER("USER");
     
    String userRoleType;
     
    private UserRoleTypes(String userRoleType){
        this.userRoleType = userRoleType;
    }
     
    public String getUserProfileType(){
        return userRoleType;
    }
     
}
