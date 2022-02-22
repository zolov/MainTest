package arrays;

/**
 * ArryaMergeExample.
 *
 * @author Igor_Zolov
 */
public class ArrayMergeExample {

    // Объявляем несколько массивов на уровне класса и сразу инициализируем их.
    public static int[] firstArray = new int[]{1, 2, 3, 4, 5};
    public static int[] secondArray = new int[]{4, 5, 6, 7};
    // Объявляем неинициализированный массив. То есть для него ещё не установлена длина.
    public static int[] resultArray;

    public static void main(String[] args) {
        // Инициализируем массив-результат суммой длин первого и второго массивов.
        // Для того чтобы в него поместились все элементы двух массивов.
        resultArray = new int[firstArray.length + secondArray.length];

        // Бежим первым циклом по firstArray и перекладываем значения из него в те же индексы(i) в resultArray.
        for (int i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i];
        }
        // Бежим вторым циклом по secondArray и перекладываем значения из него в resultArray.
        for (int j = 0; j < secondArray.length; j++) {
            // j + firstArray.length это отступ в длину первого массива.
            // Чтобы не перезаписывать то что было записано в первом цикле.
            resultArray[j + firstArray.length] = secondArray[j];
        }

        System.out.print("Результат объединения: ");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }
    }
}
