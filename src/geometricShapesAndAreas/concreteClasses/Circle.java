package geometricShapesAndAreas.concreteClasses;

import geometricShapesAndAreas.abstractClasses.BasicShape;

public class Circle extends BasicShape {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * radius * radius;
        double roundedArea = Math.round(area * 100.0) / 100.0;
        return roundedArea;
    }
}
