package com.abstractFactory;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public class ShapeFactory extends AbstractFactory{
    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;

        }
        if (shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }
        else if (shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        else return null;
    }

    @Override
    public Color getColor(String colorType) {
        return null;
    }
}
