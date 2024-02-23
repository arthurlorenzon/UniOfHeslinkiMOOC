
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "", longestName = "";
        double sum = 0, count = 0;
        while(true) {
            String input = scanner.nextLine();
            String[] parts = input.split(",");
            
            if (input.equals("")) {
                break;
            }
            sum += Integer.valueOf(parts[1]);
            count += 1;
            int length = parts[0].length();
            
            if (length > longestName.length()) {
                longestName = parts[0];
            }
        }
        
        System.out.println("Logest name: " + longestName);
        System.out.println("Average of the birth years: " + (1 * sum / count));
    }
}
