package geometricShapesAndAreas.concreteClasses;

import geometricShapesAndAreas.abstractClasses.BasicShape;

public class Triangle extends BasicShape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double area = (base * height) / 2;
        double roundedArea = Math.round(area * 100.0) / 100.0;
        return roundedArea;
    }
}
