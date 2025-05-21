package EX_string;

public class ReverseTheSentance {
    public static void main(String[] args) {
        String sen="This is TCS interview";
        StringBuilder result=new StringBuilder();
        //result.reverse();
        for (int i =sen.length()-1;i >=0; i--) {
            char c=sen.charAt(i);
            result.append(c);
        }
        System.out.println(result);


    }
}
