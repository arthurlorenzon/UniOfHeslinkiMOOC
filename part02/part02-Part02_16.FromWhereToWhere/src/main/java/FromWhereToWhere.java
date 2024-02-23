
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here

        System.out.println("Where to?");
        int a = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int b = Integer.valueOf(scanner.nextLine());
        
        for  (int j = b; j <= a; j++) {
            if (b > a) {
                System.out.println("");
            } else {
                System.out.println(j);
            }
        }
    }
}
