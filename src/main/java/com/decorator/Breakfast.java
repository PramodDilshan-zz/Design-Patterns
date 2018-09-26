package com.decorator;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public abstract class Breakfast {
    protected String description = "unknown";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
