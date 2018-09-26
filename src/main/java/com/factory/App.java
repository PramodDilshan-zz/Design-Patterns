package com.factory;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public class App {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
    }
}
