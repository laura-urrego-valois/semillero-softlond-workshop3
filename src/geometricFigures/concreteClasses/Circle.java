package geometricFigures.concreteClasses;

import geometricFigures.abstractClasses.BasicFigure;

public class Circle extends BasicFigure {

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

    @Override
    public double calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        double roundedPerimeter = Math.round(perimeter * 100.0) / 100.0;
        return roundedPerimeter;
    }
}
