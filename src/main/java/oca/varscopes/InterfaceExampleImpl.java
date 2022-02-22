package oca.varscopes;

/**
 * InterfaceExampleImpl.
 *
 * @author Igor_Zolov
 */
public abstract class InterfaceExampleImpl implements InterfaceExample {
    @Override
    public void add(String str) {
        System.out.println("No need to implement all methods in abstract class");
    }
}
