package figuresOnACanvas;

public class Canvas {

    private IDrawable[] figures;

    public Canvas(IDrawable[] figures) {
        this.figures = figures;
    }

    public void drawFigures() {
        for (IDrawable figure : figures) {
            figure.draw();
        }
    }
}
