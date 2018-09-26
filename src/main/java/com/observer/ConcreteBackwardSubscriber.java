package com.observer;

/**
 * Created by pramod_dilshan on 8/29/18.
 */
public class ConcreteBackwardSubscriber implements Subscriber {
    @Override
    public void receive(Object o) {
        StringBuffer stringBuffer = new StringBuffer(o.toString());
        System.out.println(stringBuffer.reverse().toString());

    }
}
