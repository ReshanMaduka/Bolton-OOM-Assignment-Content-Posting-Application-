/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.bolton.contentpostingapp.dto.subject.impl;

import com.edu.bolton.contentpostingapp.observer.Observer;
import com.edu.bolton.contentpostingapp.subject.Subject;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Reshan
 */
public class SubjectImpl implements Subject{

    private String youtuberName;

    private ArrayList<Observer> subscribers;               // List of subscribers

    public SubjectImpl(String youtuberName) {

        this.youtuberName = youtuberName;

        subscribers = new ArrayList<Observer>();

    }

    @Override
    public void subscribe(Observer o) {
        subscribers.add(o);
    }


    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }


    @Override
    public void notifyObservers(String message) {

        for(Observer subscriber:subscribers)
            subscriber.updatePost(message);
    }

    public void videoName(String videoName){

        System.out.println(youtuberName + "has uploaded" + videoName + "video on his channel");

        notifyObservers(videoName);

    }
   
    
}
