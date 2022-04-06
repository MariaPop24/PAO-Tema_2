import java.util.Scanner;

public class StrategyPatternDemo {

    public static void main(String[] args) {

        System.out.println("Comenzile acceptate in cadrul acestui program sunt: ");
        System.out.println("1 = Adunare");
        System.out.println("2 = Scadere");
        System.out.println("3 = Inmultire");
        System.out.println("4 = Impartire");
        System.out.println("5 = Restul Impartirii");
        System.out.println("6 = Finalul programului");

        Scanner in = new Scanner(System.in);
        boolean interactiv = true;

        while (interactiv) {

            System.out.print("Alegerea dumneavoastra: ");
            int optiune = in.nextInt();

            switch (optiune) {
                case 1:
                    System.out.print("x = ");
                    Scanner x1 = new Scanner(System.in);
                    int x = x1.nextInt();
                    System.out.print("y = ");
                    Scanner y1 = new Scanner(System.in);
                    int y = y1.nextInt();
                    Context operatie = new Context(new OperationAdd());
                    System.out.println(x + " + " + y + " = " + operatie.executeStrategy(x, y));
                    break;
                case 2:
                    System.out.print("x = ");
                    x1 = new Scanner(System.in);
                    x = x1.nextInt();
                    System.out.print("y = ");
                    y1 = new Scanner(System.in);
                    y = y1.nextInt();
                    operatie = new Context(new OperationSubstract());
                    System.out.println(x + " - " + y + " = " + operatie.executeStrategy(x, y));
                    break;
                case 3:
                    System.out.print("x = ");
                    x1 = new Scanner(System.in);
                    x = x1.nextInt();
                    System.out.print("y = ");
                    y1 = new Scanner(System.in);
                    y = y1.nextInt();
                    operatie = new Context(new OperationMultiply());
                    System.out.println(x + " * " + y + " = " + operatie.executeStrategy(x, y));
                    break;
                case 4:
                    System.out.print("x = ");
                    x1 = new Scanner(System.in);
                    x = x1.nextInt();
                    System.out.print("y = ");
                    y1 = new Scanner(System.in);
                    y = y1.nextInt();
                    operatie = new Context(new OperationDivide());
                    System.out.println(x + " / " + y + " = " + operatie.executeStrategy(x, y));
                    break;
                case 5:
                    System.out.print("x = ");
                    x1 = new Scanner(System.in);
                    x = x1.nextInt();
                    System.out.print("y = ");
                    y1 = new Scanner(System.in);
                    y = y1.nextInt();
                    operatie = new Context(new OperationRemainder());
                    System.out.println(x + " % " + y + " = " + operatie.executeStrategy(x, y));
                    break;
                case 6:
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
