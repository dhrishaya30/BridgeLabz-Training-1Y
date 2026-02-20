
public class Solution14 {
    public static int[][] add(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) res[i][j] = a[i][j] + b[i][j];
        }
        return res;
    }
    
    public static int[][] subtract(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) res[i][j] = a[i][j] - b[i][j];
        }
        return res;
    }
    
    public static int[][] multiply(int[][] a, int[][] b) {
        int r1 = a.length, c1 = a[0].length, c2 = b[0].length;
        int[][] res = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return res;
    }
    
    public static void display(int[][] m) {
        for (int[] row : m) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        
        System.out.println("Matrix A:"); display(a);
        System.out.println("Matrix B:"); display(b);
        
        System.out.println("A + B:"); display(add(a, b));
        System.out.println("A - B:"); display(subtract(a, b));
        System.out.println("A * B:"); display(multiply(a, b));
    }
}
