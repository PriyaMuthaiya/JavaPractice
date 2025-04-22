package Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EX_LinkedList {
    public static void main(String[] args) {
        List<Integer> marks=new LinkedList<Integer>();
        marks.add(34);
        marks.add(54);
        marks.add(65);
        marks.add(78);
        marks.add(65);
        Collections.sort(marks);
        Iterator it=marks.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}
