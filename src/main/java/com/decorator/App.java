package com.decorator;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public class App {
    public static void main(String[] args) {
        Breakfast rice = new rice();

        Breakfast riceWithEggWithMeal = new meal(new egg(rice));

        System.out.println(riceWithEggWithMeal.getDescription());

    }
}
