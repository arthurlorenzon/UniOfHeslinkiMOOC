
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double countNumbers = 0;
        double sumNumbers = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number > 0) {
                countNumbers += 1;
                sumNumbers += number;
                continue;
            } else if (number < 0) {
                continue;
            } else {
                break;
            }
        }
        double average = sumNumbers / countNumbers;
        if (sumNumbers != 0) {
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
