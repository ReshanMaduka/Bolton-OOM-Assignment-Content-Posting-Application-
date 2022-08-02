/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.bolton.contentpostingapp.subscriber;

import com.edu.bolton.contentpostingapp.observer.Observer;
import java.util.Date;

/**
 *
 * @author Reshan
 */
public class Subscriber implements Observer{
    
    private String subscriberName;

    public Subscriber(String subscriberName){
        this.subscriberName = subscriberName;
    }

    @Override
    public void updatePost(String post) {
        System.out.println(post); //To change body of generated methods, choose Tools | Templates.
    }


    
    
}
