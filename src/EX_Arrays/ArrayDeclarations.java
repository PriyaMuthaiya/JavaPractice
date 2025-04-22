package EX_Arrays;

import java.util.Arrays;

public class ArrayDeclarations {
    public static void main(String[] args) {

        //first way
        int[] marks={90,45,76,87,43,56};

        //second way
        int[] marks2=new int[5];
        marks[0]=91;
        marks[1]=34;
        marks[2]=56;
        marks[3]=76;
        marks[4]=98;

        System.out.println(marks2.length);
        //how to print the array
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }

        //sorting a array
        Arrays.sort(marks);
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }


    }
}
