public class Task10 {
    public static boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        if (n <= 0 || n % 2 != 0) return false;
        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 16; i++) {
            if (isPowerOfTwo(i)) {
                System.out.println(i + " is power of two");
            } else {
                System.out.println(i + " is not power of two");
            }
        }
    }
}