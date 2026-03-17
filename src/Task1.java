public class Task1 {
    public static int sumSquares(int n) {
        if (n <= 1) return n;
        return n * n + sumSquares(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sumSquares(4));
    }
}