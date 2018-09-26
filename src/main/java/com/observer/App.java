package com.observer;

/**
 * Created by pramod_dilshan on 8/29/18.
 */
public class App {

    public static void main(String[] args) {

        Publisher publisher = new ConcretePublisher();

        Subscriber s1 = new ConcreteForwardSubscriber();
        Subscriber s2 = new ConcreteBackwardSubscriber();

        publisher.subscribe(s1);
        publisher.subscribe(s2);

        publisher.start();
    }




}
