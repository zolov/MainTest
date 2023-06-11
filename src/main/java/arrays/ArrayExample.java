package arrays;

/**
 * ArrayExample.
 *
 * @author Igor_Zolov
 */
public class ArrayExample {
    public static String[] strArray = new String[10];

    public static void main(String[] args) {

        String[][] countries = new String[5][5];
        for (int i = 0; i < countries.length; i++) {
            for (int k = 0; k < countries[i].length; k++) {
                countries[i][k] = str(k);
            }
        }

        for (int i = 0; i < countries.length; i++) {
            System.out.println("Внешний массив: " + i);
            for (int k = 0; k < countries[i].length; k++) {
                System.out.println("Внутренний массив: " + countries[i][k]);
            }
        }


        for (String[] arr: countries) {
            for (String str: arr) {
                System.out.println(str);
            }
        }
//
//        String[] citis = new String[5];
//        citis[0] = "Москва";
//        citis[1] = "СПБ";
//        citis[2] = "ЕКБ";
//        citis[3] = "Новосибирск";
//        citis[4] = "МАГАДАН";
//
//        // for each
//        for (String c: citis) {
//            System.out.println("Название города: " + c);
//        }
//
//        List<String> cities = Arrays.asList(citis);
//
//        cities.forEach(System.out::println);



// Stream API
//        Arrays.stream(citis)
//                .filter(c -> c.startsWith("М"))
//                .forEach(System.out::println);




//        for (int i = 0; i < strArray.length; i++) {
//            strArray[i] = "str" + (i + 1);
//        }
//        System.out.println(Arrays.toString(strArray));

    }

    public static String str(int count) {
        if (count <= 0) {
            return new String();
        }
        String str = new String();
        for (int i = 0; i < count; i++) {
            str += "0";
        }
        return str;
    }
}
