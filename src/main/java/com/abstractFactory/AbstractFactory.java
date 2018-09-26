package com.abstractFactory;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);
    public abstract Color getColor(String colorType);
}
