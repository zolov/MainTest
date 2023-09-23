package option;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.zolov.option.None;
import ru.zolov.option.Option;
import ru.zolov.option.Some;

/**
 * OptionTest.
 *
 * @author zolov
 */
public class OptionTest {

    @Test
    void someNone() {
        Assertions.assertNull(
                null,
                handle(new None<>())
        );
    }

    @Test
    void someSome() {
        Assertions.assertEquals(
                "HELLO, PATTERN MATCHING",
                handle(new Some<>("hello, pattern matching"))
        );
    }

    @Test
    void tryUnwrapSome() {
        var os = new Some<>("Some value");
        Assertions.assertEquals("Some value", os.unwrap());
    }

    @Test
    void tryUnwrapSomeWithNullValue() {
        var on = new Some<>(null);
        Assertions.assertThrows(Option.SomeUnwrapException.class, on::unwrap);
    }

    @Test
    void tryUnwrapNone() {
        var on = new None<>();
        Assertions.assertThrows(Option.NoneUnwrapException.class, on::unwrap);
    }

    String handle(Option<String> subj) {
        return switch (subj) {
            case None<String>() -> null;
            case Some<String>(var value) -> value.toUpperCase();
        };
    }
}
