
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.valueOf(scanner.nextLine());
        int result;
        
        if (number < 0) {
            result = number * -1;
        } else {
            result = number;
        }
        System.out.println(result);
    }
}
