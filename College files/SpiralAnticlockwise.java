public class SpiralAnticlockwise {
    public static void printSpiralAnticlockwise(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
        
        while (top <= bottom && left <= right) {
            // Move left (from right to left)
            for (int i = right; i >= left; i--) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;
            
            // Move down (from top to bottom)
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][left] + " ");
            }
            left++;
            
            // Move right (from left to right)
            if (top <= bottom) {
                for (int i = left; i <= right; i++) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }
            
            // Move up (from bottom to top)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][right] + " ");
                }
                right--;
            }
        }
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        
        printSpiralAnticlockwise(matrix);
    }
}