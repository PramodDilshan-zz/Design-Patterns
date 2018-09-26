package com.template;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public abstract class Game {

    public final void play(){
        intialize();
        start();
        end();
    }

    protected abstract void intialize();
    protected abstract void start();
    protected abstract void end();
}
