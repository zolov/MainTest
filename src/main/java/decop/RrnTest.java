package decop;

import static java.lang.String.format;
import static java.util.Objects.requireNonNull;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

/**
 * RrnTest.
 *
 * @author Igor_Zolov
 */
public class RrnTest {

    private static final DateTimeFormatter defaultFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
    public static void main(String[] args) {
        Long id = 12096L;

        String sys = formatTraceNumber(id);

        System.out.println("sys: " + sys);

        LocalDateTime now = LocalDateTime.now();
        String formattedDate = now.format(defaultFormatter);
        System.out.println("formattedDate: " + formattedDate);

        String rrn = formatRetrievalReferenceNumber(formattedDate, sys);

        System.out.println("rrn: " + rrn);
    }

    public static String formatTraceNumber(Long identifier) {
        return format("%06d", requireNonNull(identifier));
    }

    public static String dayOfYear(int day) {
        return format("%03d", requireNonNull(day));
    }

    private static String formatRetrievalReferenceNumber(String transmissionDateAndTime, String systemTraceAuditNumber) {
        String tdat = requireNonNull(transmissionDateAndTime);
        String stan = requireNonNull(systemTraceAuditNumber);

        LocalDate now = LocalDate.now();
        int lastDigitOfYear = now.get(ChronoField.YEAR) % 10;
        String dayOfYear = dayOfYear(now.get(ChronoField.DAY_OF_YEAR));
        String tdtHours = tdat.substring(8, 10);

        return format("%d%s%s%s", lastDigitOfYear, dayOfYear, tdtHours, stan);
    }
}
