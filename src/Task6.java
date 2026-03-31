import java.util.Scanner;

public class Task6 {
    public static void reverseStrings(int n, Scanner sc) {
        if (n <= 0) return;

        if (sc.hasNext()) {
            String s = sc.next();
            reverseStrings(n - 1, sc);
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            reverseStrings(n, sc);
        }
    }
}
