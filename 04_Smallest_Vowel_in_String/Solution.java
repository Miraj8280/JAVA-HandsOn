import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    private static char findSmallestVowel(String str) {
        // List of vowels
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u')); 
        char smallestVowel = Character.MAX_VALUE;

        for (char ch : str.toCharArray()) {
            if (vowels.contains(ch) && ch < smallestVowel) {
                smallestVowel = ch;
            }
        }

        // If no vowel was found, return a empty character
        return (smallestVowel == Character.MAX_VALUE) ? ' ' : smallestVowel;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t > 0) {
            String str = sc.nextLine();
            System.out.println(findSmallestVowel(str));
            t--;
        }

        sc.close();
    }
}
