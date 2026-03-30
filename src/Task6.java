import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void reverseSequence(int n) {
        if (n == 0) return; // base case

        String s = sc.next();       // read current string
        reverseSequence(n - 1);     // recursive call
        System.out.println(s);      // print after → reverse order
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        reverseSequence(n);
    }
}