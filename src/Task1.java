public class Task1 {
    public static int sumSquares(int n) {
        if (n <= 0) return 0;       // base case
        return n * n + sumSquares(n - 1); // recursive step
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(sumSquares(n));
    }
}