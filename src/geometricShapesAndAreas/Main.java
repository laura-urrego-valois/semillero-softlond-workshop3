package geometricShapesAndAreas;

import geometricShapesAndAreas.concreteClasses.Circle;
import geometricShapesAndAreas.concreteClasses.Square;
import geometricShapesAndAreas.concreteClasses.Triangle;
import geometricShapesAndAreas.interfaces.IGeometricFigure;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<IGeometricFigure> figures = new ArrayList<>();
        figures.add(new Circle(4.4));
        figures.add(new Square(5.2));
        figures.add(new Triangle(3.4, 4.8));

        System.out.println("Geometric figures");
        System.out.println();
        for (IGeometricFigure geometricFigure : figures) {
            String figureType = geometricFigure.getClass().getSimpleName();
            double area = geometricFigure.calculateArea();
            System.out.println(figureType + " - Area: " + area);
        }
    }
}
