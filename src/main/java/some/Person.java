package some;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * KolyaTest.
 *
 * @author Igor_Zolov
 */
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Person {
    public static void main(String[] args) {
    }
    private String fullName;
    private int age;
    private String city;

    public String strUpr(String str) {
        return str.toUpperCase();
    }

    public void move(){
        System.out.println(getFullName()+ " move");
    }
    public void talk(){
        System.out.println(getFullName()+" talk");
    }

}
