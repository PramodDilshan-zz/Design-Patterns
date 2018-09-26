package com.observer;

/**
 * Created by pramod_dilshan on 8/29/18.
 */
public interface Publisher {
    void subscribe(Subscriber s);
    void unsubscribe(Subscriber s);
    void start();
}
