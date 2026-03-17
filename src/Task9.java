import java.util.Scanner;

public class Task9 {
    public static void permutations(String prefix, String str) {
        if (str.length() == 0) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            permutations(
                prefix + str.charAt(i),
                str.substring(0, i) + str.substring(i + 1)
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        permutations("", s);
    }
}