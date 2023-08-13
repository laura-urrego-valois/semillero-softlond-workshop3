package geometricFigures.concreteClasses;

import geometricFigures.abstractClasses.BasicFigure;

public class Triangle extends BasicFigure {

    double base;
    double height;
    double side1, side2, side3;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        double area = (base * height) / 2;
        double roundedArea = Math.round(area * 100.0) / 100.0;
        return roundedArea;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = side1 + side2 + side3;
        double roundedPerimeter = Math.round(perimeter * 100.0) / 100.0;
        return roundedPerimeter;
    }
}
