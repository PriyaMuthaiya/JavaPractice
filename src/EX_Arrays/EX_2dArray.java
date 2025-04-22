package EX_Arrays;

public class EX_2dArray {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{3,4,5},{6,7,8,}};

        //to print matrix r is length so the it should iterate row first and inside row each column

        for (int i = 0; i < matrix.length; i++) { //iterating row first
            for (int j = 0; j <matrix[i].length ; j++) { //inside ow iterating col
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();


        }
    }
}
