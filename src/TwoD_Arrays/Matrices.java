package TwoD_Arrays;
import java.util.*;
public class Matrices {

    public static boolean search(int matrix[][], int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.println("Element found at position: (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Element not found in the matrix.");
        return false;
    }
    public static void main(String[] args) {
        // Example of a 2D array (matrix)
        int[][] matrix = new int[3][3];
        int n= matrix.length; // number of rows
        int m = matrix[0].length; // number of columns
        Scanner sc = new Scanner(System.in);
        for (int i=0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

        search(matrix, 5);
    }
}
