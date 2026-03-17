public class Task4 {
    public static int power(int b, int n) {
        if (n == 0) return 1;
        return b * power(b, n - 1);
    }

    public static int sumPowers(int b, int n) {
        if (n == 0) return 1;
        return power(b, n) + sumPowers(b, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sumPowers(4, 3));
    }
}