import java.util.Scanner;

public class FacadePatternDemo {

    public static void main(String[] args) {



        System.out.println("Comenzile acceptate in cadrul acestui program sunt:");
        System.out.println("1 = Patrat");
        System.out.println("2 = Dreptunghi");
        System.out.println("3 = Cerc");
        System.out.println("4 = Finalul programului");
        
        boolean interactiv = true;

        while(interactiv) {

            System.out.print("Alegerea dumneavoastra: ");
            Scanner in = new Scanner(System.in);
            int optiune = in.nextInt();

            if(optiune == 1) {
                System.out.print("Lungimea laturii patratului = ");
                Scanner x1 = new Scanner(System.in);
                int x = x1.nextInt();
                ShapeMaker shapeMaker = new ShapeMaker(x);
                shapeMaker.drawSquare();
            }
            else if(optiune == 2) {
                System.out.print("Lungimea dreptunghiului = ");
                Scanner x1 = new Scanner(System.in);
                int x = x1.nextInt();
                System.out.print("Latimea dreptunghiului = ");
                Scanner y1 = new Scanner(System.in);
                int y = y1.nextInt();
                ShapeMaker shapeMaker = new ShapeMaker(x, y);
                shapeMaker.drawRectangle();
            }
            else if(optiune == 3) {
                System.out.print("Raza cercului = ");
                Scanner x1 = new Scanner(System.in);
                int x = x1.nextInt();
                ShapeMaker shapeMaker = new ShapeMaker(x);
                shapeMaker.drawCircle();
            }
            else if(optiune == 4) {
                System.out.println("Ati ajuns la finalul programului!");
                interactiv = false;
            }
            else {
                System.out.println("Nu exista aceasta optiune!");
            }
        }
    }
}
