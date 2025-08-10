package TwoD_Arrays;

public class StaircaseSearch {
    public static boolean staircaseSearch(int matrix[][], int key){
        int row=0, col=matrix[0].length-1; // start from the top-right corner

        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == key) {
                System.out.println("Element found at position: (" + row + "," + col + ")");
                return true;
            } else if(matrix[row][col] > key) {
                col--; // move left
            } else {
                row++; // move down
            }
        }
        System.out.println("Element not found in the matrix.");
        return false;
    }
    public static void main(String[] args) {
        int matrix [][] = {
        {10, 20, 30, 40},
        {15, 25, 35, 45},
        {27, 29, 37, 48},
        {32, 33, 39, 50}
    };
        int key = 33;
        staircaseSearch(matrix, key);
    }
}
