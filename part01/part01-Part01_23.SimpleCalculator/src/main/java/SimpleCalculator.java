
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        int sum = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiply = firstNumber * secondNumber;
        double divide = (double) firstNumber / secondNumber;
        
        System.out.println(firstNumber +  " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtraction);
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiply);
        System.out.println(firstNumber + " / " + secondNumber + " = " + divide);
    }
}
