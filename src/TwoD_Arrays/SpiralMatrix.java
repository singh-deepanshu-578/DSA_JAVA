package TwoD_Arrays;

public class SpiralMatrix {
    public static void printSpiral(int martix[][]){
        int n=martix.length; // number of rows
        int m = martix[0].length; // number of columns
        int startRow = 0, startCol = 0;
        int endRow = n - 1, endCol = m - 1;
        
        while(startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(martix[startRow][j] + " ");
            }
            

            // right
            for(int i= startRow+1; i <= endRow; i++) {
                System.out.print(martix[i][endCol] + " ");
            }
            

            // bottom
            for (int j = endCol-1; j >= startCol; j--) {
                if(startRow == endRow) break; // to avoid duplicate printing in single row case
                System.out.print(martix[endRow][j] + " ");
            }

            // left
            for (int i = endRow-1; i >= startRow+1; i--) {
                if(startCol == endCol) break; // to avoid duplicate printing in single column case
                System.out.print(martix[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println("Spiral Order of the Matrix:");
        printSpiral(matrix);
    }
}
