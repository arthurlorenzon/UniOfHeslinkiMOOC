
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        
        do {
            word = scanner.nextLine();
            String[] pieces = word.split(" ");
            int lastWordIndice = pieces.length - 1;
            System.out.println(pieces[lastWordIndice]);
            
        } while(!(word.equals("")));

    }
}
