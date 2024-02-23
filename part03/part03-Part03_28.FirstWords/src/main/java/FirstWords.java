
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        
        do {
            word = scanner.nextLine();
            String[] pieces = word.split(" ");
            
            System.out.println(pieces[0]);
            
        } while (!(word.equals("")));
    }
}
