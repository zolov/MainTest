package ru.zolov.option;

/**
 * None.
 *
 * @author zolov
 */
public record Some<T>(T value) implements Option<T> {
    @Override
    public T unwrap() {
        if (value == null) {
            throw new SomeUnwrapException();
        }
        return value;
    }
}
