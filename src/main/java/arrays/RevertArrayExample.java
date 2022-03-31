package arrays;

import java.util.Arrays;

/**
 * RevertArrayExample.
 *
 * @author Igor_Zolov
 */
public class RevertArrayExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            swap(array, i);
        }
    }

    private static void swap(int[] array, int i) {
        int temp = array[i];
        array[i] = array[array.length - i - 1];
        array[array.length - i - 1] = temp;
    }
}
