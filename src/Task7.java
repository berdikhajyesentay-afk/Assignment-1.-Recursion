import java.util.Scanner;

public class Task7 {


    public static int fillTop(int[][] m, int row, int col, int n, int val, int i) {
        if (i == n) return val;
        m[row][col + i] = val;
        return fillTop(m, row, col, n, val + 1, i + 1);
    }


    public static int fillRight(int[][] m, int row, int col, int n, int val, int i) {
        if (i == n) return val;
        m[row + i][col + n - 1] = val;
        return fillRight(m, row, col, n, val + 1, i + 1);
    }


    public static int fillBottom(int[][] m, int row, int col, int n, int val, int i) {
        if (i == n) return val;
        m[row + n - 1][col + n - 1 - i] = val;
        return fillBottom(m, row, col, n, val + 1, i + 1);
    }


    public static int fillLeft(int[][] m, int row, int col, int n, int val, int i) {
        if (i == n) return val;
        m[row + n - 1 - i][col] = val;
        return fillLeft(m, row, col, n, val + 1, i + 1);
    }

    public static void fillSpiral(int[][] m, int row, int col, int n, int val) {
        if (n <= 0) return;

        if (n == 1) {
            m[row][col] = val;
            return;
        }

        val = fillTop(m, row, col, n - 1, val, 0);
        val = fillRight(m, row, col, n - 1, val, 0);
        val = fillBottom(m, row, col, n - 1, val, 0);
        val = fillLeft(m, row, col, n - 1, val, 0);

        fillSpiral(m, row + 1, col + 1, n - 2, val);
    }

    
    public static void printMatrix(int[][] m, int n, int i, int j) {
        if (i == n) return;

        if (j == n) {
            System.out.println();
            printMatrix(m, n, i + 1, 0);
            return;
        }

        System.out.print(m[i][j] + " ");
        printMatrix(m, n, i, j + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        fillSpiral(matrix, 0, 0, n, 1);
        printMatrix(matrix, n, 0, 0);
    }
}
