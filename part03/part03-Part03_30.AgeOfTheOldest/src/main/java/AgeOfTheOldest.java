
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int olderAge = 0;
        int age = 0;
        while (true) {
            input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
           
            age = Integer.valueOf(parts[1]);
            if (age > olderAge) {
                olderAge = age;
            }
                
        }
        
        System.out.println("Age of the oldest: " + olderAge);
        
    }
}
