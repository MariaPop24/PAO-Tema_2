public class Circle implements Shape {

    int raza = 1;

    public Circle() {

    }

    public Circle(int raza1) {
        raza = raza1;
    }

    @Override
    public void draw() {
        System.out.println("Cerc cu raza de " + raza);
    }
}
