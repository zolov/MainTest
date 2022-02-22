package com.skaii;

public class ArrayCopyExample {
    private static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    private static int[] resultArray;

    public static void main(String[] args) {
        resultArray = arrayConcat(firstArray, secondArray);
        for (int item: resultArray) {
            System.out.printf("%d ", item);
        }
    }

    private static int[] arrayConcat(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];

        for (int i = 0; i < result.length; i++) {
            if (i < first.length) {
                result[i] = first[i];
            } else if (i > first.length) {
                result[i] = second[i - first.length];
            }
        }
        return result;
    }
}
