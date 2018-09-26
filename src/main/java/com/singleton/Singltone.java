package com.singleton;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public class Singltone {
    private static Singltone soloInstance= new Singltone();

    private Singltone(){
        if (soloInstance != null)
            throw new RuntimeException("use getInstance method");
    }

    public Singltone getInstance(){
        return soloInstance;
    }
}
