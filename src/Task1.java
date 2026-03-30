public class Task1 {

    public static int sumSquares(int n) {
        if (n <= 0) return 0;
        return (n * n) + sumSquares(n - 1);
    }


    public static String getExpression(int n) {
        if (n <= 1) return "1^2";
        return getExpression(n - 1) + " + " + n + "^2";
    }

    public static void main(String[] args) {
        int n = 4;
        if (n > 0) {
            System.out.println(getExpression(n) + " = " + sumSquares(n));
        }
    }
}