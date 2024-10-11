import java.util.Scanner;

public class Solution {
    private static int[] countOfSpaceAndCharacter(String str) {
        int countOfSpace = 0;
        int countOfChars = 0;

        for (char ch : str.toCharArray()) {
            if (ch == ' ') {
                countOfSpace++;
            } else if (Character.isLetter(ch)) {
                countOfChars++;
            }
        }

        return new int[] {countOfSpace, countOfChars};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t > 0) {
            String str = sc.nextLine();

            int[] result = countOfSpaceAndCharacter(str);
            System.out.println("No of spaces : " + result[0] + " and characters : " + result[1]);

            t--;
        }

        sc.close();
    }
}