import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = Integer.valueOf(scanner.nextLine());
        printFromNumberToOne(value);
    }
    
    public static void printFromNumberToOne(int number) {
        int i = number;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }

}
