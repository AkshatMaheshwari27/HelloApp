/**
 * UC 5: Display "Hello" with Multiple Command-Line Arguments using Enhanced For 
 * Loop or Default Message - The application should accept multiple names as 
 * command-line arguments and display a personalized greeting for each user using 
 * an enhanced for loop. If no names are provided, it should display "Hello, World!".
 * * Usage: java HelloApp [name1] [name2] ... [nameN]
 * * @author Developer Name
 * @version 5.0
 * @since UC1
 */
public class uc5 {

    public static void main(String[] args) {
        // Check if any arguments were provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Using StringBuilder for efficient string manipulation
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            // Enhanced For Loop to iterate through all command-line arguments
            for (String name : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }

            // Display the final personalized greeting
            System.out.println("Hello, " + nameBuilder.toString() + "!");
        }
    }
}