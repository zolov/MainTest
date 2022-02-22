package com.skaii;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Java8.
 *
 * @author Igor Zolov
 */
public class Java8 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Kotlin", "Groovy", "Scala", "Ceylon", "Clojure");

        Collections.sort(names, (a, b) -> b.compareTo(a));

        Collections.sort(names, Comparator.reverseOrder());

        Converter<String, Integer> converter = from -> Integer.valueOf(from);

        Converter<String, Double> converterMethodRef = Double::valueOf;

        Integer convertedInteger = converter.convert("125256");

        Double convertedDouble = converterMethodRef.convert("123.1");

        System.out.println(convertedInteger);
        System.out.println(convertedDouble);

        Something something = new Something();
        Converter<String, String> stringConverter = something::startWith;
        String conv = stringConverter.convert("Java");
        System.out.println(conv);

        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");
        System.out.println(person);
    }
}
