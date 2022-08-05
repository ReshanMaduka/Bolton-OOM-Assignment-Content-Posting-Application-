package uk.edu.bolton.contentposting.subject.impl;



import uk.edu.bolton.contentposting.observer.Observer;
import uk.edu.bolton.contentposting.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class Group implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String post;
    private String name;

    public Group(String name) {
        this.name = name;
    }

    public void newPost(String post) {
        this.post = post;
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.updatePost(this.post);
        }
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

}
