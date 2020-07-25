package Adarsh.designprinciples;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

public class App {
    public static void main( String[] args )
    {   Scanner sc = new Scanner(System.in);
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n");
        System.out.println("Enter choice:");
        int choice = sc.nextInt();
        double n1,n2;
        System.out.print("Enter number 1:");
        n1 = sc.nextInt();
        System.out.print("Enter number 2:");
        n2 = sc.nextInt();
        switch (choice){
            case 1: Add a = new Add(n1,n2);
                    System.out.println("Result: "+a.calculate());
                    break;
            case 2: Subt s = new Subt(n1,n2);
                System.out.println("Result: "+s.calculate());
                break;
            case 3: Mult m = new Mult(n1,n2);
                System.out.println("Result: "+m.calculate());
                break;
            case 4: Divi d = new Divi(n1,n2);
                System.out.println("Result: "+d.calculate());
                break;
        }
        sc.close();
    }
}