package com.decorator;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public class milkRice extends Breakfast {

    milkRice(){
        description = "milkRice";
    }

    @Override
    public double cost() {
        return 300;
    }
}
