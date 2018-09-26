package com.abstractFactory;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public class App {
    public static void main(String[] args) {

        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory shapeFactory = factoryProducer.getFactory("shape");

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
    }
}
