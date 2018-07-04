package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.Circle;
import com.kodilla.patterns.factory.Rectangle;
import com.kodilla.patterns.factory.Shape;
import com.kodilla.patterns.factory.Square;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task createTask(final String shapeClass) {
        switch (shapeClass) {
            case DRIVING:
                return new DrivingTask("Delivery", "Atlanta", "Truck");
            case PAINTING:
                return new PaintingTask("Refreshing painting", "White", "ceiling");
            case SHOPPING:
                return new ShoppingTask("Clothes Shopping", "hat", 1);
            default:
                return null;
        }
    }
}
