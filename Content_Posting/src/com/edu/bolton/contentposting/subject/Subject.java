package com.edu.bolton.contentposting.subject;

import com.edu.bolton.contentposting.observer.Observer;

public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();


}
