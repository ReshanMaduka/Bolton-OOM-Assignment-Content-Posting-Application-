package uk.edu.bolton.contentposting.subject;

import uk.edu.bolton.contentposting.observer.Observer;

public interface Subject {

    public boolean registerObserver(Observer observer);

    public boolean removeObserver(Observer observer);

    public void notifyObserver();


}
