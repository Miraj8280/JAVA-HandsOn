import java.util.Scanner;
import java.lang.StringBuilder;

public class Solution {
    /* ----------------------------------------------------------------
                        TWO POINTERS APPROACH
                        - TC: O(n)
                        - SC: O(n)
     ------------------------------------------------------------------*/  
    private static String reverseString(String str) {
        char[] charArray = str.toCharArray();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        return new String(charArray).toLowerCase();
    }

    /* ----------------------------------------------------------------
                        USING StringBuilder
                        - TC: O(n)
                        - SC: O(n)
     ------------------------------------------------------------------*/ 
    private static String reverseString2(String str) {

        return new StringBuilder(str).reverse().toString().toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t > 0) {
            String str = sc.nextLine();
            // System.out.println(reverseString(str));
            System.out.println(reverseString2(str));
            t--;
        }

        sc.close();
    }
}
