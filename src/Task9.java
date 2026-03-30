import java.util.Scanner;

public class Task9 {
    // Inner recursion to replace the for-loop
    public static void loopChars(String prefix, String str, int i) {
        if (i >= str.length()) return;

        // Recursive call for the next level of the permutation
        permutations(
                prefix + str.charAt(i),
                str.substring(0, i) + str.substring(i + 1)
        );

        // Recursive call to simulate the "next i" in a loop
        loopChars(prefix, str, i + 1);
    }

    public static void permutations(String prefix, String str) {
        if (str.length() == 0) {
            System.out.println(prefix);
            return;
        }
        loopChars(prefix, str, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            permutations("", sc.next());
        }
    }
}