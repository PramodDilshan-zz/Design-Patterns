package com.decorator;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public class meal extends CurryForBreakfast {

    Breakfast breakfast;

    meal(Breakfast breakfast){
        this.breakfast = breakfast;
    }
    @Override
    public String getDescription() {
        return breakfast.getDescription() + " and meal";
    }

    @Override
    public double cost() {
        return breakfast.cost() + 20;
    }
}
