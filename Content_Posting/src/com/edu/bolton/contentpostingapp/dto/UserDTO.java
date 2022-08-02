/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.bolton.contentpostingapp.dto;

/**
 *
 * @author Reshan
 */
public class UserDTO {
    
    private String userName;

    public UserDTO() {
    }

    public UserDTO(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserDTO{" + "userName=" + userName + '}';
    }
    
    
    
    
}
