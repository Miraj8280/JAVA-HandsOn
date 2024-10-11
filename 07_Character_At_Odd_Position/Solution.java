import java.util.Scanner;

public class Solution {
    private static String printCharactersAtOddPos(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < str.length(); i += 2) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t > 0) {
            String str = sc.nextLine();
            System.out.println(printCharactersAtOddPos(str));
            t--;
        }

        sc.close();
    }
}
