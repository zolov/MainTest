package com.skaii;

import java.util.Arrays;

/**
 * Main.
 *
 * @author Igor Zolov
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[] {5, 11, 213, 23 ,453, 4, 10};
        int[] sorted = sort(array);
        for (int item: sorted) {
            System.out.printf("%d ", item);
        }
    }

    private static int[] sort(final int[] array) {
        int[] result = Arrays.copyOf(array, array.length);
        int temp;
        for (int i = 0; i < result.length; i++) {
            for (int k = 1; k < result.length - i; k++) {
                if (result[k - 1] > result[k]) {
                    temp = result[k - 1];
                    result[k - 1] = result[k];
                    result[k] = temp;
                }
            }
        }
        return result;
    }
}