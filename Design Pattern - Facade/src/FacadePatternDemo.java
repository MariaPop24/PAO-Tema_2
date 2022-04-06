import java.util.Scanner;

public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();


        System.out.println("Comenzile acceptate in cadrul acestui program sunt:");
        System.out.println("1 = Patrat");
        System.out.println("2 = Dreptunghi");
        System.out.println("3 = Cerc");
        System.out.println("4 = Finalul programului");

        Scanner in = new Scanner(System.in);
        boolean interactiv = true;

        while(interactiv) {

            System.out.println("Alegerea dumneavoastra: ");
            int optiune = in.nextInt();

            switch(optiune) {
                case 1:
                    shapeMaker.drawSquare();
                    break;
                case 2:
                    shapeMaker.drawRectangle();
                    break;
                case 3:
                    shapeMaker.drawCircle();
                    break;
                case 4:
                    System.out.println("Ati ajuns la finalul programului!");
                    interactiv = false;
                    break;
                default:
                    System.out.println("Nu exista aceasta optiune!");
                    break;
            }
        }
    }
}
