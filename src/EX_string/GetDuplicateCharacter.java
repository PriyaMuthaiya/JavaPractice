package EX_string;

import java.util.HashSet;
import java.util.Set;

public class GetDuplicateCharacter
{
    public static void main(String[] args) {
        String original="thisisjava";
        Set trace=new HashSet();
        Set <Character> duplicate=new HashSet<>();
        for(char c:original.toCharArray()){
            if(!trace.add(c)){
                duplicate.add(c);
            }
        }
       StringBuilder duplicateString=new StringBuilder();
        for (char c:duplicate){
            duplicateString.append(c);
        }
        System.out.println(duplicateString);
    }
}
