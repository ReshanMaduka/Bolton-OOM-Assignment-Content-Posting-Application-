package uk.edu.bolton.contentposting.subject;

import uk.edu.bolton.contentposting.observer.Observer;

public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();


}
