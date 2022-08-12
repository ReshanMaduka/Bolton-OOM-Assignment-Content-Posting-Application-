package uk.edu.bolton.contentposting.subject;

import uk.edu.bolton.contentposting.observer.Observer;

public interface Subject {

     boolean registerObserver(Observer observer);

     boolean removeObserver(Observer observer);

     void notifyObserver(String post);


}
