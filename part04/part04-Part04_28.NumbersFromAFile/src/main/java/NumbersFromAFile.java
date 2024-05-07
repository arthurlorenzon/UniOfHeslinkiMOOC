
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int row = 0;
        int count = 0;
       
        
        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            while (fileScan.hasNextLine()) {
                row = fileScan.nextInt();
                if (row >= lowerBound && row <= upperBound) {
                    count++;
                }
            }
            System.out.println("Numbers: " + count);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
