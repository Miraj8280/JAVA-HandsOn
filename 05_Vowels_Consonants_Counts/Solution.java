import java.util.Scanner;

public class Solution {
    private static void countVowelsAndConsonants(String str) {
        str = str.toLowerCase();

        String vowels = "aeiou";
        int vowelCounts = 0;
        int consonantCounts = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) {
                    vowelCounts++;
                } else {
                    consonantCounts++;
                }
            }
        }

        System.out.println("Vowels count - " + vowelCounts);
        System.out.println("Consonant count - " + consonantCounts);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t > 0) {
            String str = sc.nextLine();
            countVowelsAndConsonants(str);
            t--;
        }

        sc.close();
    }
}
