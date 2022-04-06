public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {

        int max = 10;
        int min = 1;
        int range = max - min + 1;

        circle = new Circle((int) Math.floor(Math.random() * range + 1));
        rectangle = new Rectangle((int) Math.floor(Math.random() * range + 1), (int) Math.floor(Math.random() * range + 1));
        square = new Square((int) Math.floor(Math.random() * range + 1));
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
