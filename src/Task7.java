import java.util.Scanner;

public class Task7 {
    public static void fillSpiral(int[][] matrix, int row, int col, int val, int n) {
        if (n <= 0) return;

        if (n == 1) {
            matrix[row][col] = val;
            return;
        }

        for (int i = 0; i < n - 1; i++) matrix[row][col + i] = val++;
        for (int i = 0; i < n - 1; i++) matrix[row + i][col + n - 1] = val++;
        for (int i = 0; i < n - 1; i++) matrix[row + n - 1][col + n - 1 - i] = val++;
        for (int i = 0; i < n - 1; i++) matrix[row + n - 1 - i][col] = val++;

        fillSpiral(matrix, row + 1, col + 1, val, n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        fillSpiral(matrix, 0, 0, 1, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}