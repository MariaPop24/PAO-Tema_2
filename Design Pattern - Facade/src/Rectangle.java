import javax.crypto.spec.RC2ParameterSpec;

public class Rectangle implements Shape {

    int lungime = 1;
    int latime = 1;

    public Rectangle() {

    }

    public Rectangle(int lungime1, int latime1) {
        lungime = lungime1;
        latime = latime1;
    }

    @Override
    public void draw() {
        System.out.println("Dreptunghi de lungime " + lungime + " si latime " + latime);
    }
}
