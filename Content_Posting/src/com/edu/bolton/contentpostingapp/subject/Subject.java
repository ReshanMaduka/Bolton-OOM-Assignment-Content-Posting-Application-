/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.bolton.contentpostingapp.subject;

import com.edu.bolton.contentpostingapp.observer.Observer;

/**
 *
 * @author Reshan
 */
public interface Subject {

    public void subscribe(Observer observer);

    public void unsubscribe(Observer observer);

    public void notifyObservers(String message);

}
