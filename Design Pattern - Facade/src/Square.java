public class Square implements Shape {

    int latura = 1;

    public Square() {

    }

    public Square(int latura1) {
        latura = latura1;
    }

    @Override
    public void draw() {
        System.out.println("Patrat cu latura " + latura);
    }
}
