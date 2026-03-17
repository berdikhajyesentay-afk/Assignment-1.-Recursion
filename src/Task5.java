import java.util.Scanner;

public class Task5 {
    public static void reverseInts(int n, Scanner sc) {
        if (n == 0) return;

        int val = sc.nextInt();
        reverseInts(n - 1, sc);
        System.out.print(val + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseInts(n, sc);
    }
}