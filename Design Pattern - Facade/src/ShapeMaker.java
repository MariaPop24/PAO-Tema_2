public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker(int x, int y) {

        rectangle = new Rectangle(x, y);
     }

    public ShapeMaker(int x) {

        circle = new Circle(x);
        square = new Square(x);

    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
