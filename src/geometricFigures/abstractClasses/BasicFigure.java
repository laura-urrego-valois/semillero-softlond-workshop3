package geometricFigures.abstractClasses;

import geometricFigures.interfaces.IGeometricFigure;

public abstract class BasicFigure implements IGeometricFigure {

    @Override
    public abstract double calculateArea();

    @Override
    public abstract double calculatePerimeter();
}
