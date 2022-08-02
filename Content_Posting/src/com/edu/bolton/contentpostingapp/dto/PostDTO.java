/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.bolton.contentpostingapp.dto;

import java.util.Date;

/**
 *
 * @author Reshan
 */
public class PostDTO {
    
    private String post;
    private String user;
    private Date date;

    public PostDTO() {
    }

    public PostDTO(String post, String user, Date date) {
        this.post = post;
        this.user = user;
        this.date = date;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "PostDTO{" + "post=" + post + ", user=" + user + ", date=" + date + '}';
    }
    
    
    
    
}
