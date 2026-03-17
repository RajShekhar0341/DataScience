public class Spiral {
    public static void main(String[] args) {
        int n = 5; // Size of the spiral (5x5 matrix)
        char[][] matrix = new char[n][n];
        
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        char letter = 'A';
        
        while (top <= bottom && left <= right) {
            // Right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = letter++;
            }
            top++;
            
            // Down
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = letter++;
            }
            right--;
            
            // Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = letter++;
                }
                bottom--;
            }
            
            // Up
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = letter++;
                }
                left++;
            }
        }
        
        // Print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}