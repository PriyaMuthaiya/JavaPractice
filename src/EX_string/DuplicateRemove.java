package EX_string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemove {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String afterDuplicate=sc.next();
        System.out.println("After removing duplicate chars"+removeDuplicate(afterDuplicate));



    }
    public static String removeDuplicate(String original){
        StringBuilder result=new StringBuilder();
        Set<Character> stringSet=new HashSet<Character>();

        /*for (int i = 0; i < original.length(); i++) {
            char c=original.charAt(i);
            if(!stringSet.contains(c)){
                stringSet.add(c);
                result.append(c);
            }

        }
        original= result.toString();*/
        //using foreach
        for (char c:original.toCharArray())
        {
            if(!stringSet.contains(c)){
                stringSet.add(c);
                result.append(c);
            }
        }
        original= result.toString();
        return original;

    }
}
