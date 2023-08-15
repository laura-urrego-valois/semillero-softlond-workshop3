package figuresOnACanvas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        IDrawable[] figures = new IDrawable[]{
                new Square(),
                new Circle(),
                new Diamond(),
                new Triangle()
        };

        System.out.println("Drawing figures");
        System.out.println();
        Canvas canvas = new Canvas(figures);
        canvas.drawFigures();
    }
}
