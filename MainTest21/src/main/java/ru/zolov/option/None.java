package ru.zolov.option;

/**
 * None.
 *
 * @author zolov
 */
public record None<T>() implements Option<T> {
    @Override
    public T unwrap() {
        throw new NoneUnwrapException();
    }
}

