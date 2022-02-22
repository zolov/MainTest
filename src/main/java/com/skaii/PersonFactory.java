package com.skaii;

/**
 * PersonFactory.
 *
 * @author Igor Zolov
 */
public interface PersonFactory<P extends Person> {
    P create(String a, String b);
}
