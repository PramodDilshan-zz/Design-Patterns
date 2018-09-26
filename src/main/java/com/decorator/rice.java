package com.decorator;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public class rice extends Breakfast {

    rice(){
        description = "rice";
    }

    @Override
    public double cost() {
        return 200;
    }
}
