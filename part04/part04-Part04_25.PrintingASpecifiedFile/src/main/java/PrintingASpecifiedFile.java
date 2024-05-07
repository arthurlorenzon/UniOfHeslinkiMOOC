
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String archive = scanner.nextLine();
        
        try (Scanner teclado = new Scanner(Paths.get(archive));) {
            while (teclado.hasNextLine()) {
                System.out.println(teclado.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
