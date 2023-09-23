package ru.zolov.option;

/**
 * Option.
 *
 * @author zolov
 */
public sealed interface Option<T> permits Some, None {

    T unwrap();

    class NoneUnwrapException extends RuntimeException {
        public NoneUnwrapException() {
            super("An attempt was made to unwrap none");
        }
    }

    class SomeUnwrapException extends RuntimeException {
        public SomeUnwrapException() {
            super("Missing value when trying to unwrap option");
        }
    }
}


