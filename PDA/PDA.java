import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Permissible Dating Age program
 *
 * @author Mr. Jaffe
 * @version 2021-06-22 Version 1.0.0
 */
public class PDA
{

    /**
     * Constructor for objects of class PDA
     */
    public PDA()
    {
        // We don't need to do anything in the constructor for
        // our program.
    }
    
    /**
     * This is the main event loop for our PDA program
     */
    Scanner scanner = new Scanner(System.in);
    int age;
    int LOWER_BOUND = 14;
    public void runEventLoop() {
        while (true) { 
            System.out.println("How old are you?");
            try {
                age = scanner.nextInt();
                int YoungerAge = (age/2) + 7;
                int HigherAge = (age*2) - 14;
                if (age % 2 == 1) {
                    YoungerAge = YoungerAge + 1;
                }
                if (age < LOWER_BOUND) {
                    System.out.println(age+" is too young!!");
                } else {
                    System.out.println("Lowest age: " + YoungerAge);
                    System.out.println("Highest age: " + HigherAge);
                }
                
            }catch (InputMismatchException error) {
                System.out.println("Please enter an integer");
                scanner.next();
            }
        }
    }

    /**
     * The main method instantiates and runs the program
     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}

