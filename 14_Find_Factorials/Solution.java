import java.util.Scanner;

public class Solution {
    private static long findFactorial(int n) {
        long factorial = 1;
        
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        return factorial;
    }
    
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        long[] factorials = new long[5];
        
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
            factorials[i] = findFactorial(nums[i]);
        }
        
        for (long factorial : factorials) {
            System.out.println(factorial);
        }
        
        sc.close();
    }
}