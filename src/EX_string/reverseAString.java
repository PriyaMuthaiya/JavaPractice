package EX_string;

public class reverseAString {

    public static void main(String[] args) {
        //method 1 using mutable class string builder

        StringBuilder name=new StringBuilder("madam");
        String original=name.toString(); //since name is muttable store it in seperate string to keep the original string
        String reverseName=name.reverse().toString();
        System.out.println(reverseName);
        //check if palindrome
        if(reverseName.equalsIgnoreCase(original)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }

    }
}
