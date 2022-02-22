package oca.varscopes;

import java.util.ArrayList;
import java.util.List;

/**
 * RefPassThrough.
 *
 * @author Igor_Zolov
 */
public class RefPassThrough {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String str = "Работает";
        RefPassThrough.listAdd(list, str);
        for (String s : list) {
            System.out.println(s);
        }

        int val = 0xCAFE_BABE;
        System.out.println(val);
    }

    static void listAdd(List<String> list, String str) {
        list.add(str);
    }
}
