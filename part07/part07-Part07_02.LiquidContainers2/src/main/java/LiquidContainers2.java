
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container firstVolume = new Container();
        Container secondVolume = new Container();
        
        UserInterface userInterface = new UserInterface(firstVolume, secondVolume, scanner);
        userInterface.start();
    }

}
