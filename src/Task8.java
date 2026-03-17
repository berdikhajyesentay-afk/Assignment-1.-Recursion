import java.util.Scanner;

public class Task8 {
    public static void generateSequences(int n, int k, String current, int length) {
        if (length == n) {
            System.out.println(current.trim());
            return;
        }

        for (int i = 1; i <= k; i++) {
            generateSequences(n, k, current + i + " ", length + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        generateSequences(n, k, "", 0);
    }
}