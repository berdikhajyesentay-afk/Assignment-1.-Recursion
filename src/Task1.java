public class Task1 {
    public static int sumSquares(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return (n * n) + sumSquares(n - 1);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Result: " + sumSquares(n));
    }
}