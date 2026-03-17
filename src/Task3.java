public class Task3 {
    public static int sumIntegers(int n) {
        if (n <= 1) return n;
        return n + sumIntegers(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sumIntegers(5));
    }
}