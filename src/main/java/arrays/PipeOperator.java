package arrays;

import java.util.ArrayList;

/**
 * PipeOperator.
 *
 * @author Igor_Zolov
 */
public class PipeOperator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean result = false;
        result |= list.add(1);
        System.out.println("result " + result);
        test();
        new Integer(15);
    }

  public static void test() {
    System.out.println("Test method");
  }
  
}
