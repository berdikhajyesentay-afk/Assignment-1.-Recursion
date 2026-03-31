public class Task10 {
    public static boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        if (n <= 0 || n % 2 != 0) return false;
        return isPowerOfTwo(n / 2);
    }


    public static void testRange(int current, int limit) {
        if (current > limit) return;

        if (isPowerOfTwo(current)) {
            System.out.println(current + " is power of two");
        } else {
            System.out.println(current + " is not power of two");
        }

        testRange(current + 1, limit);
    }

    public static void main(String[] args) {

        testRange(0, 16);
    }
}