import java.util.Scanner;

public class Task8 {

    public static void tryValues(int n, int k, String current, int length, int i) {
        if (i > k) return;


        generateSequences(n, k, current + i + " ", length + 1);


        tryValues(n, k, current, length, i + 1);
    }

    public static void generateSequences(int n, int k, String current, int length) {
        if (length == n) {
            System.out.println(current.trim());
            return;
        }
       
        tryValues(n, k, current, length, 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            generateSequences(n, k, "", 0);
        }
    }
}
