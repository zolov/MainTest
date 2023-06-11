package algo;

import java.util.Scanner;

/**
 * RepeatedStringsSolution.
 *
 * @author Igor_Zolov
 */
public class RepeatedStringsSolution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        strings = new String[6];
        for (int i = 0; i < 6; i++) {
            strings[i] = scanner.nextLine();
        }
        // 1) Идём в цикле по каждой строке в массиве strings
        // 2) Сохраняем строку текущей итерации цикла (1) для дальнейшего сравнения
        // 3) Идём в цикле по каждой строке в массиве strings, но начинаем со второго индекса (i + 1)
        // 4) Если текущая строка уже null, то прерываем текущую итерацию цикла (3) и берём следующее слово
        // 5) Если текущая строка (2) равна следующей строке цикла (3), то устанавливаем вместо ссылки на объект ссылку на null
        // 6) Выводим результат по завершению цикла (1)
        for (int i = 0; i < strings.length; i++) { // 1)
            String currentString = strings[i]; // 2)
            for (int j = i + 1; j < strings.length; j++) { // 3)
                if (currentString == null) { // 4)
                    break;
                }
                if (currentString.equals(strings[j])) { // 5)
                    strings[j] = null;
                    strings[i] = null;
                }
            } // 3)
        } // 1)
        for (int i = 0; i < strings.length; i++) { // 6)
            System.out.print(strings[i] + ", ");
        }
        scanner.close();
    }
}
