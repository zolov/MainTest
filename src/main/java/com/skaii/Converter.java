package com.skaii;

/**
 * Converter.
 *
 * @author Igor Zolov
 */
@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}
