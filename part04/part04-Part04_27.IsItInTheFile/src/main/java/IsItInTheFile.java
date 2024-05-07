
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        boolean found = false;
        String row = "";
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        

        try ( Scanner fileScan = new Scanner(Paths.get(file))) {

            while (fileScan.hasNextLine()) {
                row = fileScan.nextLine();
                if (searchedFor.equals(row)) {
                    found = true;
                }    
            }
             if (found) {
                    System.out.println("Found!");
                } else {
                    System.out.println(row);
                    System.out.println("Not found.");
                }

        } catch (IOException e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
