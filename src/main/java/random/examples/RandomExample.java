package random.examples;

import java.util.HashSet;
import java.util.Random;

/**
 * RandomExample.
 *
 * @author Igor_Zolov
 */
public class RandomExample {
    public static void main(String[] args) {
//        var unique = new HashSet<Integer>();
//        new Random().ints(1_000_000, MIN_VALUE, MAX_VALUE)
//                .forEach((int num) -> {
//                            System.out.println(num);
//                            if (unique.contains(num)) System.err.println(num);
//                            else unique.add(num);
//                        }
//                );
        HashSet<Integer> unique = new HashSet<>();
        new Random().ints(1_000_000, 0, 5_000_000)
                .forEach((int num) -> {
                            System.out.println(num);
                            if (isFalse(unique.add(num)))
                                System.err.println(num);
                        }
                );
    }

    public static boolean isFalse(final Boolean bool) {
        return Boolean.FALSE.equals(bool);
    }
}
