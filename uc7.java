/**
 * HelloApp - UC7 - A simple Java application that greets multiple users by name 
 * if provided as command-line arguments using the String.join() method, or defaults 
 * to greeting "World" if no names.
 * * Usage: java HelloApp [name1] [name2] ... [nameN]
 * @author Developer Name
 * @version 6.0
 * @since UC1
 */
public class uc7
{

    public static void main(String[] args) {
        // Default value if no arguments are provided
        String names = "World";

        // If arguments exist, join them using a comma and space
        if (args.length > 0) {
            // String.join(delimiter, elements) automatically handles the logic 
            // of placing the delimiter ONLY between elements.
            names = String.join(", ", args);
        }

        // Final output
        System.out.println("Hello, " + names + "!");
    }
}