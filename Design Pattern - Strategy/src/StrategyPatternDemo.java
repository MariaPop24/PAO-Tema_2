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

            if(optiune == 1) {
                System.out.print("x = ");
                Scanner x1 = new Scanner(System.in);
                int x = x1.nextInt();
                System.out.print("y = ");
                Scanner y1 = new Scanner(System.in);
                int y = y1.nextInt();
                Context operatie = new Context(new OperationAdd());
                int z = operatie.executeStrategy(x, y);
                System.out.println(x + " + " + y + " = " + z);
            }
            else if(optiune == 2) {
                System.out.print("x = ");
                Scanner x1 = new Scanner(System.in);
                int x = x1.nextInt();
                System.out.print("y = ");
                Scanner y1 = new Scanner(System.in);
                int y = y1.nextInt();
                Context operatie = new Context(new OperationSubstract());
                int z = operatie.executeStrategy(x, y);
                System.out.println(x + " - " + y + " = " + z);
            }
            else if(optiune == 3) {
                System.out.print("x = ");
                Scanner x1 = new Scanner(System.in);
                int x = x1.nextInt();
                System.out.print("y = ");
                Scanner y1 = new Scanner(System.in);
                int y = y1.nextInt();
                Context operatie = new Context(new OperationMultiply());
                int z = operatie.executeStrategy(x, y);
                System.out.println(x + " * " + y + " = " + z);
            }
            else if(optiune == 4) {
                System.out.print("x = ");
                Scanner x1 = new Scanner(System.in);
                int x = x1.nextInt();
                System.out.print("y = ");
                Scanner y1 = new Scanner(System.in);
                int y = y1.nextInt();
                Context operatie = new Context(new OperationDivide());
                int z = operatie.executeStrategy(x, y);
                System.out.println(x + " / " + y + " = " + z);
            }
            else if(optiune == 5) {
                System.out.print("x = ");
                Scanner x1 = new Scanner(System.in);
                int x = x1.nextInt();
                System.out.print("y = ");
                Scanner y1 = new Scanner(System.in);
                int y = y1.nextInt();
                Context operatie = new Context(new OperationRemainder());
                int z = operatie.executeStrategy(x, y);
                System.out.println(x + " % " + y + " = " + z);
            }
            else if(optiune == 6) {
                System.out.println("Ati ajuns la finalul programului!");
                interactiv = false;
            }
            else {
                System.out.println("Nu exista aceasta optiune!");
            }
        }
    }
}
