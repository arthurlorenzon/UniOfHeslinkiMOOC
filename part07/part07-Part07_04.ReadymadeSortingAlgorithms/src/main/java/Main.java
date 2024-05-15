
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] arrayString = {"2", "3", "1", "7"};
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(3);
        numbers.add(7);
        ArrayList<String> values = new ArrayList<>();
        values.add("1");
        values.add("5");
        values.add("2");
        sort(array);
        System.out.println("Sorted array int: " + Arrays.toString(array));
        sort(arrayString);
        System.out.println("Sorted array string: " + Arrays.toString(array));
        sortIntegers(numbers);
        System.out.println("Sorted ArrayList int: " + numbers);
        sortStrings(values);
        System.out.println("Sorted ArrayList String: " + values);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}
