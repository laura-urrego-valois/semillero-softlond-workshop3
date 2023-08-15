package geometricShapesAndAreas.concreteClasses;

import geometricShapesAndAreas.abstractClasses.BasicShape;

public class Square extends BasicShape {

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
}
