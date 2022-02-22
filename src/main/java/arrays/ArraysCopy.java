package arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * ArraysCopy.
 *
 * @author Igor_Zolov
 */
public class ArraysCopy {

    public static int[] firstArray = new int[]{1, 2, 3, 4, 5};
    public static int[] secondArray = new int[]{4, 5, 6, 7};

    public static int[] resultArray;

    public static void main(String[] args) {

        int firstArrayLength = firstArray.length;
        int secondArrayLength = secondArray.length;
        resultArray = new int[firstArrayLength + secondArrayLength];
        System.arraycopy(firstArray, 0, resultArray, 0, firstArrayLength);
        System.arraycopy(secondArray, 0, resultArray, firstArrayLength, secondArrayLength);

        System.out.print("Результат объединения: ");
        for (int i : resultArray) {
            System.out.print(i + " ");
        }
    }
}
