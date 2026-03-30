public class Task4 {

    public static int sumPowersEfficient(int b, int n, int currentPow) {
        if (n == 0) return currentPow;

        return currentPow + sumPowersEfficient(b, n - 1, currentPow * b);
    }

    public static void main(String[] args) {

        System.out.println(sumPowersEfficient(4, 3, 1));
    }
}