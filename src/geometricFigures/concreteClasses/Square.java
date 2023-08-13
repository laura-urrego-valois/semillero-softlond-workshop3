package geometricFigures.concreteClasses;

import geometricFigures.abstractClasses.BasicFigure;

public class Square extends BasicFigure {

    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        double area = side * side;
        double roundedArea = Math.round(area * 100.0) / 100.0;
        return roundedArea;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 4 * side;
        double roundedPerimeter = Math.round(perimeter * 100.0) / 100.0;
        return roundedPerimeter;
    }
}
