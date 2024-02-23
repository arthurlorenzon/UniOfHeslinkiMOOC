
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numbers = 0;
        int sumNumbers = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int userNumber = Integer.valueOf(scanner.nextLine());
            
            if (userNumber == 0) {
                break;
            }
            if (userNumber > 0) {
                numbers += 1;
                sumNumbers += userNumber;
            } else {
                numbers += 1;
                sumNumbers += userNumber;
            }
        }
        System.out.println("Number of numbers: " + numbers);
        System.out.println("Sum of the numbers: " + sumNumbers);
    }
}
