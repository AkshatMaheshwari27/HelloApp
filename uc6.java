/**
 * UC 6: Display "Hello" with Multiple Command-Line Arguments using substring to 
 * Remove Trailing Delimiter - The application should accept multiple names and 
 * display a personalized greeting, using substring to remove the trailing delimiter.
 * * Usage: java HelloApp [name1] [name2] ... [nameN]
 * @author Developer Name
 * @version 6.0
 */
public class uc6 
{

    public static void main(String[] args) {
        // Handle the case where no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            // 1. Enhanced For Loop: Appends EVERY name followed by a comma and space
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // 2. String Manipulation: Convert to String to use substring
            String finalNames = nameBuilder.toString();

            // 3. Remove Trailing Delimiter: If we have content, remove the last ", "
            if (finalNames.length() > 0) {
                // substring(start, end) where end is total length minus the 2 characters: ", "
                finalNames = finalNames.substring(0, finalNames.length() - 2);
            }

            System.out.println("Hello, " + finalNames + "!");
        }
    }
}