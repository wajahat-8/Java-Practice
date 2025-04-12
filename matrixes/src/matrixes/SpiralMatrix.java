package matrixes;

public class SpiralMatrix {
    
    // Method to print the matrix in spiral order
    public static void printSpiral(int[][] matrix) {
        int top = 0;                       // Topmost row               {1, 2, 3, 6},
        int bottom = matrix.length - 1;    // Bottommost row            {4, 5, 6, 8},
        int left = 0;                      // Leftmost column           {7, 8, 9, 9}       
        int right = matrix[0].length - 1; // Rightmost column

        // Loop until all boundaries meet
        while (top <= bottom && left <= right) {

            // 1. Traverse from Left to Right on the top row
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
               
            }
            top++; // Move top boundary down

            // 2. Traverse from Top to Bottom on the rightmost column
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--; // Move right boundary left

            // 3. Traverse from Right to Left on the bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--; // Move bottom boundary up
            }

            // 4. Traverse from Bottom to Top on the leftmost column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++; // Move left boundary right
            }
        }
    }

    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {
            {1, 2, 3, 6},
            {4, 5, 6, 8},
            {7, 8, 9, 9}
        };

        // Print the matrix in spiral order
        printSpiral(matrix);
    }
}
