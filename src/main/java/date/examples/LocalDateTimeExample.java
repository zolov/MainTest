package date.examples;

import static java.time.LocalDateTime.of;
import static java.util.Objects.nonNull;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * LocalDateTimeExample.
 *
 * @author Igor_Zolov
 */
public class LocalDateTimeExample {

    public static void main(String[] args) {
//        LocalDate localDate = LocalDate.now();
//        System.out.printf("Local date: [%s] %n", localDate);
//        LocalDateTime localDateTime = LocalDateTime.of(localDate, LocalTime.MAX);
//        System.out.printf("Local date time: [%s]", localDateTime);

        LocalDateTime period = getPeriod(LocalDate.now());
        System.out.printf("Local date time: [%s] %n", period);
        LocalDateTime localDateTime = period.plusHours(-3);
        System.out.printf("Minus 3 Local date time: [%s] %n", localDateTime);
    }

    private static LocalDateTime getPeriod(LocalDate endDate) {

        LocalDateTime ldt = of(endDate, LocalTime.of(23,59));
        System.out.printf("Local date time: [%s] %n", ldt);
        LocalDateTime localDateTime = ldt.plusHours(3);
        System.out.printf("Plus day Local date time: [%s] %n", localDateTime);

        return localDateTime;
    }
}
