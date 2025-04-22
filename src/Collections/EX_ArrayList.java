package Collections;

import java.util.ArrayList;
import java.util.List;

public class EX_ArrayList {
    public static void main(String[] args) {
        List al=new ArrayList();
        al.add(1);
        al.add(2);
        al.add(4);

        System.out.println(al.contains(5));
        System.out.println(al.indexOf(2));
        System.out.println(al.isEmpty());

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));

        }

    }
}
