/**
 * UC2: HelloApp
 * Objective: Accept a user's name via command-line and print a personalized greeting.
 */
public class uc2 
{
    public static void main(String[] args) {
        // Check if an argument was provided to avoid ArrayIndexOutOfBoundsException
        if (args.length > 0) {
            // args[0] captures the first word after the program name in the terminal
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}