
public class Solution15 {
    public static int[][] transpose(int[][] m) {
        int r = m.length, c = m[0].length;
        int[][] t = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) t[j][i] = m[i][j];
        }
        return t;
    }
    
    public static int determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }
    
    public static int determinant3x3(int[][] m) {
        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1]) -
               m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0]) +
               m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }
    
    public static void display(int[][] m) {
        for (int[] row : m) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] m2 = {{1, 2}, {3, 4}};
        int[][] m3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        System.out.println("Transpose of 2x2:"); display(transpose(m2));
        System.out.println("Determinant 2x2: " + determinant2x2(m2));
        System.out.println("Determinant 3x3: " + determinant3x3(m3)); // Should be 0
    }
}
