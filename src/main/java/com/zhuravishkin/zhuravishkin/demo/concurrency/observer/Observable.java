package com.zhuravishkin.zhuravishkin.demo.concurrency.observer;

public interface Observable {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
