package com.decorator;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public class egg extends CurryForBreakfast {

    Breakfast breakfast;

    egg(Breakfast breakfast){
        this.breakfast = breakfast;
    }
    @Override
    public String getDescription() {
        return breakfast.getDescription() + " and egg";
    }

    @Override
    public double cost() {
        return breakfast.cost() + 10;
    }
}
