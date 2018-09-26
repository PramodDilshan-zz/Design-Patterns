package com.abstractFactory;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public class ColorFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String colorType){
        if (colorType == null){
            return null;
        }
        if (colorType.equalsIgnoreCase("red")){
            return new Red();
        }
        else if (colorType.equalsIgnoreCase("blue")){
            return new Blue();
        }
        else return null;
    }
}
