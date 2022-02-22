package arrays;

import java.awt.*;
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
    }
}
