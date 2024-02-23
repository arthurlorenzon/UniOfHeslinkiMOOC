
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        System.out.println("Search for?");
        int num = Integer.valueOf(scanner.nextLine());
        int index = 0;
        int listSize = list.size();
        
        for (int i = 0; i < list.size(); i++) {
            int numOnList = list.get(i);
            index = i;
            if (numOnList == num) {
                System.out.println(num + " is at the index " + index);
            }
        }
    }
}
