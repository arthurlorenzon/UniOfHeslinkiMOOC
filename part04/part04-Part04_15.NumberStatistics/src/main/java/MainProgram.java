
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics sumAll = new Statistics();
        Statistics sumEven = new Statistics();
        Statistics sumOdd = new Statistics();

        System.out.println("Enter numbers:");

        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            
            if (input % 2 == 0) {
                sumEven.addNumber(input);
            } else {
                sumOdd.addNumber(input);
            }
            sumAll.addNumber(input);
        }
        System.out.println("Sum: " + sumAll.sum());
        System.out.println("Sum of even numbers: " + sumEven.sum());
        System.out.println("Sum of odd numbers: " + sumOdd.sum());
    }
}
