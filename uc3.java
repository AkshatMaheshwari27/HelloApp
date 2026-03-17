/**
 * UC3: HelloApp 
 * Objective: Provide a default greeting ("World") if no name is passed as an argument.
 */
public class uc3
{

    public static void main(String[] args) {
        // Step 1: Initialize with a default value
        String name = "World";

        // Step 2: Check if an argument exists to override the default
        if (args.length > 0) {
            name = args[0];
        }

        // Step 3: Output the result
        System.out.println("Hello, " + name + "!");
    }
} 
