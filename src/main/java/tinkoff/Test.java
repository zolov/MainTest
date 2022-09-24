package tinkoff;

import java.util.stream.Stream;

/**
 * Test.
 *
 * @author Igor_Zolov
 */
public class Test {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(item -> item % 2 == 0)
                .forEach(System.out::println);
        ;
    }
}
