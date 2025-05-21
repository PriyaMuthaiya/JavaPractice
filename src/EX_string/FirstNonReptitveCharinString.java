package EX_string;

import java.util.LinkedHashMap;
import java.util.Map;
public class FirstNonReptitveCharinString {
public static void main(String[] args) {


    String input="swiss";
    Map<Character,Integer> charcount=new LinkedHashMap<>(); {

        //count the character frquencies

        for(char c:input.toCharArray()){
            charcount.put(c,charcount.getOrDefault(c,0)+1);

        }
        for (Map.Entry<Character, Integer> entry : charcount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
}
