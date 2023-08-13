package geometricFigures;

import geometricFigures.concreteClasses.Circle;
import geometricFigures.concreteClasses.Square;
import geometricFigures.concreteClasses.Triangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------CIRCLE-----------------");
        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("The circle's area is " + circle.calculateArea());
        System.out.println("The circle's perimeter is " + circle.calculatePerimeter());
        System.out.println("---------------------------");


        System.out.println("----------SQUARE-----------------");
        System.out.println("Enter the side of the square: ");
        double side = scanner.nextDouble();
        Square square = new Square(side);
        System.out.println("The square's area is " + square.calculateArea());
        System.out.println("The square's perimeter is " + square.calculatePerimeter());
        System.out.println("---------------------------");

        System.out.println("----------TRIANGLE-----------------");
        System.out.println("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        Triangle triangle = new Triangle(base, height);
        System.out.println("The triangle's area is " + triangle.calculateArea());
        System.out.println("Enter the sides of the triangle: ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        Triangle triangle2 = new Triangle(side1, side2, side3);
        System.out.println("The triangle's perimeter is " + triangle2.calculatePerimeter());
        System.out.println("------------END---------------");

    }
}
