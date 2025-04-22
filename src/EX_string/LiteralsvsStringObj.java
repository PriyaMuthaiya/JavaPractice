package EX_string;

import org.w3c.dom.ls.LSOutput;

public class LiteralsvsStringObj {

    public static void main(String[] args) {
        //String literals are created in SCP (String Constant Pool) which is immutable

        String s1= "hello";

        String s2=new String("hello");
        String s5=new String("hello");
        String s3="hello";
        System.out.println(s1==s2); //comparing two string location
        System.out.println(s1==s3);
        System.out.println(s2==s5);

        //comparing two strings value
        System.out.println(s1.equals(s2)); //comparing two string location
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s5));

        String s6=s1.substring(2);
        System.out.println(s6);
    }




}
