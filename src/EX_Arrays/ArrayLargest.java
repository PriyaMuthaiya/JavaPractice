package EX_Arrays;

import java.util.Arrays;

public class ArrayLargest {
    public static void main(String[] args) {
        int[] ele={45,23,12,4,54,32}; //
        int largesrt=findMax(ele);
        System.out.println(largesrt);
        int smallest=findMin(ele);
        System.out.println(smallest);
        int secondLargestele=findSecondMax(ele);
        System.out.println(secondLargestele);
    }

        //Logic building
        //input is we need pass as an array
        //output is integer single element not an array
        //traverse every element in a array and compare with one another then each time store the ma value
        //return the max value






    static int findMax(int[] arr)
    {
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }
    static int findMin(int[] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }

        }

        return min;
    }

    static int findSecondMax(int[] arr){
        Arrays.sort(arr);
        int secondMaxele=arr[arr.length-2];
        /*for (int i = 0; i < arr.length; i++) {

        }*/

        return secondMaxele;



    }
}
