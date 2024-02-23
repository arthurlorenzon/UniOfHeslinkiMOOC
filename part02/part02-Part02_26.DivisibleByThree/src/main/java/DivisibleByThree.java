
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int firstValue = Integer.valueOf(scanner.nextLine());
        int secondValue = Integer.valueOf(scanner.nextLine());
        
        divisibleByThreeInRange(firstValue, secondValue);
    }
    
    public static void divisibleByThreeInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

}
