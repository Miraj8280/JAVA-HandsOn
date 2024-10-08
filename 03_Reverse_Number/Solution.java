import java.util.Scanner;
import java.lang.StringBuilder;

public class Solution {
    /* ----------------------------------------------------------------
                        APPROACH 1: MATH
                        - TC: O(log(n))
                        - SC: O(1)
    -------------------------------------------------------------------*/
    private static int reverseNumber(int n) {
        int num = n;
        int revNum = 0;

        while (num > 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num /= 10;
        }

        return revNum;
    }
    
    /* ----------------------------------------------------------------
                        APPROACH 2: StringBuilder
                        - TC: O(n)
                        - SC: O(n)
    -------------------------------------------------------------------*/
    private static int reverseNumber2 (int n) {
        String str = Integer.toString(n);
        
        String revStr = new StringBuilder(str).reverse().toString();

        return Integer.parseInt(revStr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t > 0) {
            int n = sc.nextInt();
            // System.out.println(reverseNumber(n));
            System.out.println(reverseNumber2(n));
            t--;
        }

        sc.close();
    }
}
