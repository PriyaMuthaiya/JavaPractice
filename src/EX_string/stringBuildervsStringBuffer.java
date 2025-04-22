package EX_string;

public class stringBuildervsStringBuffer {
    public static void main(String[] args) {
     //StringBuffer
        StringBuffer sb=new StringBuffer("priya");
        //append
        sb.append("muthaiya");
        //now no need of storing to another string becuase it will append to the old string
        System.out.println(sb);

        //reverse
        sb.reverse();
        System.out.println(sb);
    //StringBuilder
        StringBuilder sb1=new StringBuilder("priya");
        //append
        sb1.append("muthaiya");
        //now no need of storing to another string becuase it will append to the old string
        System.out.println(sb1);

        //reverse
        sb1.reverse();
        System.out.println(sb1);

    }
}
