package com.observer;

/**
 * Created by pramod_dilshan on 8/29/18.
 */
public class ConcreteForwardSubscriber implements Subscriber {
    @Override
    public void receive(Object o) {
        System.out.println(o.toString());
    }
}
