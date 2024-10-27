import java.util.Scanner;
  
  public class MyClass {
  	private static int findSumOfOdds(int[] nums) {
    	int sum = 0;
        
        for (int num : nums) {
        	if (num % 2 != 0) {
            	sum += num;
            }
        }
        
        return sum;
    }
  
  	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        
        for (int i = 0; i < 5; i++) {
        	nums[i] = sc.nextInt();
        }

        sc.close();
        
        int sum = findSumOfOdds(nums);
        
        if (sum > 8 && sum < 50) {
        	System.out.println("Sum of odd numbers:" + sum);
        } else {
        	System.out.println("NA");
        }
    }
  }