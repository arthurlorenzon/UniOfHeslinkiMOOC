
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scan.nextLine());
        double tax;
        double tax1 = 100 + (gift - 5000) * 0.08;
        double tax2 = 1700 +(gift - 25000) * 0.1;
        double tax3 = 4700 + (gift - 55000) * 0.12;
        double tax4 = 22100 + (gift - 200000) * 0.15;
        double tax5 = 142100 + (gift - 1000000) * 0.17;
       
        
        if (gift < 5000) {
            System.out.println("No tax!");
        } else if (gift >= 5000 && gift <= 25000) {
            tax = tax1;
            System.out.println("Tax: " + tax);
        } else if (gift > 25000 && gift <= 55000) {
            tax = tax2;
            System.out.println("Tax: " + tax);
        } else if (gift > 55000 && gift <= 200000) {
            tax = tax3;
            System.out.println("Tax: " + tax);
        } else if (gift > 200000 && gift <= 1000000) {
            tax = tax4;
            System.out.println("Tax: " + tax);
        } else {
            tax = tax5;
            System.out.println("Tax: " + tax);
        }

    }
}
