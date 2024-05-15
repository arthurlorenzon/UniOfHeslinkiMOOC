import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] array) {
        int smallNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallNumber) {
                smallNumber = array[i];
            }
        }
        return smallNumber;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int smallNumber = smallest(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallNumber) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallNumber = table[startIndex];
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallNumber) {
                smallNumber = table[i];
            }
        }
        int smallIndex = startIndex;

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] == smallNumber) {
                smallIndex = i;
            }
        }

        return smallIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int holdValue = array[index1];
        array[index1] = array[index2];
        array[index2] = holdValue;
    }

    public static void sort(int[] array) {
        int index = 0;
        System.out.println(Arrays.toString(array));
        
        while (index < array.length) {
            swap(array, index, indexOfSmallestFrom(array, index));
            System.out.println(Arrays.toString(array));
            index++;
        }
    }
}
