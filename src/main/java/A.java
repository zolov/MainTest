import java.util.HashMap;

/**
 * SomeClassExample.
 *
 * @author Igor_Zolov
 */
public class A {

    public String name;

    public static void main(String[] args) {
        var map = new HashMap<A, Integer>();
        A a1 = new A();
        a1.name = "one";

        map.put(a1, 1);

        a1.name = "two";
        A a2 = new A();
        a2.name = "one";

        System.out.println(map.get(a1));
        //null
        System.out.println(map.get(a2));
        //null
    }

    public int hashCode() {
        return name.hashCode();
    }

    public boolean equals(Object o) {
        if (o instanceof A) {
            return name.equals(((A) o).name);
        }
        return false;
    }
}
