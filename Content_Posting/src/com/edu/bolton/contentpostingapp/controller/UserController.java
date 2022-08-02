/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.bolton.contentpostingapp.controller;

import com.edu.bolton.contentpostingapp.dto.UserDTO;
import java.util.ArrayList;

/**
 *
 * @author Reshan
 */
public class UserController {

    public ArrayList<UserDTO> names = new ArrayList<UserDTO>();

    public static ArrayList<UserDTO> arrList = new ArrayList<UserDTO>();

    public void setArrList(ArrayList<UserDTO> arrList) {
        this.arrList = arrList;
    }

   
}
