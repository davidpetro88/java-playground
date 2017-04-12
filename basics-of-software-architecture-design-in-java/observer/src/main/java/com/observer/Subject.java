package com.observer;

/**
 * Created by david on 09/04/17.
 */
public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyAllObserver();
}
