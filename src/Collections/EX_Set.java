package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EX_Set {
    public static void main(String[] args) {

        Set hs=new HashSet(); //not order and remove  dplicate
        hs.add("banana");
        hs.add("apple");
        hs.add("orange");
        hs.add("kiwi");
        hs.add("orange");
        hs.add("null");
        System.out.println("-------Hash set---------");
        for(Object o:hs){
            System.out.println(o);
        }

        //Linkedhashset --maintain same order ,

        Set lhs=new LinkedHashSet(); //not order and remove  dplicate and
        lhs.add("banana");
        lhs.add("apple");
        lhs.add("orange");
        lhs.add("kiwi");
        lhs.add("orange");
        System.out.println("-------Linked hash set---------");
        for(Object o:lhs){
            System.out.println(o);
        }

        //Treeset // helps in sorting
        Set ts=new TreeSet(); //not order and remove  dplicate and
        ts.add("banana");
        ts.add("apple");
        ts.add("orange");
        ts.add("kiwi");
        ts.add("orange");
        System.out.println("-------tree set---------");
        for(Object o:ts){
            System.out.println(o);
        }
    }
}
