
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double numbers = 0;
        double sumNumbers = 0;
        
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
        double average = sumNumbers / numbers;
        System.out.println("Average of the numbers: " + average);

    }
}
