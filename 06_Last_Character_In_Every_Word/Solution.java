import java.util.Scanner;

public class Solution {

    public static void printLastCharOfWords(String str) {
        char[] result = str.toCharArray();
        
        for (int i = 1; i < result.length; i++) {
            // Check if the current char is a whitespace and the previous char is a valid
            // letter (non-digit and non-whitespace)
            if (Character.isWhitespace(result[i]) && !Character.isDigit(result[i - 1])
                    && !Character.isWhitespace(result[i - 1])) {
                System.out.print(result[i - 1]);
            }
        }

        // Handle the last character if it's part of a valid word (non-digit and
        // non-whitespace)
        if (!Character.isWhitespace(result[result.length - 1]) && !Character.isDigit(result[result.length - 1])) {
            System.out.print(result[result.length - 1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t > 0) {
            String str = sc.nextLine();
            printLastCharOfWords(str);
            t--;
        }

        sc.close();
    }
}
