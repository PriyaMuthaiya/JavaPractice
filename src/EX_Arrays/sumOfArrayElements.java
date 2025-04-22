package EX_Arrays;

public class sumOfArrayElements {
    public static void main(String[] args) {
        int[] ele={4,6,3,2,1,0};
        int sum=0;
        for (int i = 0; i <ele.length ; i++) {
          sum=sum+ele[i];

        }
        System.out.println(sum);
    }
}
