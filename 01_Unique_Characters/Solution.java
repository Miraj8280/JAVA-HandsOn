import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Solution {
    /* ----------------------------------------------------------------
                        BRUTE FORCE APPROACH
                        - TC: O(n^2)
                        - SC: O(1)
     ------------------------------------------------------------------*/
    private static String findUniqueCharactersBruteForce(String str) {
        int n = str.length();
        str = str.toLowerCase();
        String result = "";

        for (int i = 0; i < n; i++) {
            boolean isUnique = true; // If a character is unique, then flag is true

            // Check if the current character has already appeared in the result
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isUnique = false;
                    break;
                } 
            }

            // If it's unique, add it to the result
            if (isUnique) {
                result += str.charAt(i);
            }
        }

        return result;
    }

    /* ----------------------------------------------------------------
                        OPTIMAL APPROACH
                        - TC: O(n)
                        - SC: O(n)
     ------------------------------------------------------------------*/
    private static String findUniqueCharactersOptimal(String str) {
        str = str.toLowerCase();
        Set<Character> set = new HashSet<>();
        String result = "";
        
        for (char ch : str.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                result += ch;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t > 0) {
            String str = sc.nextLine();
            // System.out.println(findUniqueCharactersBruteForce(str));
            System.out.println(findUniqueCharactersOptimal(str));
            t--;
        }

        sc.close();
    }
}