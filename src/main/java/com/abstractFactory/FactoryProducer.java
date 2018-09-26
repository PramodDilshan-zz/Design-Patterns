package com.abstractFactory;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public class FactoryProducer {
    public AbstractFactory getFactory(String factoryName){
        if (factoryName == null){
            return null;
        }
        if (factoryName.equalsIgnoreCase("Shape")){
            return new ShapeFactory();
        }
        else if (factoryName.equalsIgnoreCase("color")){
            return new ColorFactory();
        }
        else return null;
    }
}
