import java.util.*;

public class Solution {
    private static char findMinValuedChar(String str) {
        int min = Integer.MAX_VALUE;
        char minValuedChar = ' ';
        
        for (char ch : str.toCharArray()) {
            
            if (ch < min) {
                min = ch;
                minValuedChar = ch;
            }
        }
        
        return minValuedChar;
    }
    
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        
        System.out.println(findMinValuedChar(str));
    }
}