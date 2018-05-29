package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> shapes = new ArrayList<>();

    public int getListSize(){
        return shapes.size();
    }

    public void addFigure(Shape shape){
       shapes.add(shape);
    }

    public void removeFigure(Shape shape){
        if(shapes.size() != 0) {
            shapes.remove(shape);
        } else {
            System.out.println("List was empty!");
        }
    }

    public Shape getFigure(int n){
        if(shapes.size() != 0) {
            return shapes.get(n);
        } else {
            System.out.println("List was empty!");
            return null;
        }
    }

    public ArrayList<String> showFigures(){
        ArrayList<String> figureName = new ArrayList<>();
        for (Shape shapes : shapes) {
            figureName.add(shapes.getShapeName());
        }
        return figureName;
    }
}
