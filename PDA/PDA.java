import java.util.Scanner;

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
    Scanner scanner = new Scanner(System.in)
    int age = 0;
    public void runEventLoop() {
        while (true) { 
            System.out.println("How old are you?");
            try {
                age = scanner.nextInt();
                System.out.println(age);
            } catch (InputMismatchException error) {
                System.out.println("Please enter an integer");
            }
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
