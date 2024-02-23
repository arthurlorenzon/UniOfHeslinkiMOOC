
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        
        switch (username) {
            case "alex":
                if (password.equals("sunshine")) {
                    System.out.println("You have successfully logged in!");
                } else {
                    System.out.println("Incorrect username or password!");
                }
                break;
            case "emma":
                if (password.equals("haskell")) {
                    System.out.println("You have successfully logged in!");
                } else {
                    System.out.println("Incorrect username or password!");
                }
                break;
        }
        
    }
}
