/**
 * UC4: HelloApp 
 * Objective: Greet multiple users provided via command-line arguments.
 * If no names are provided, default to "World".
 */
public class uc4
{

    public static void main(String[] args) {
        String greetingTarget;

        if (args.length > 0) {
            // StringBuilder is more memory-efficient for loops than String concatenation
            StringBuilder nameBuilder = new StringBuilder();
            
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                
                // Add a comma and space only if it's not the last element
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            greetingTarget = nameBuilder.toString();
        } else {
            greetingTarget = "World";
        }

        System.out.println("Hello, " + greetingTarget + "!");
    }
}