import java.util.Scanner;

public class Solution {
    private static boolean isPerfectSquare(int n) {
        int sqrt = (int) Math.sqrt(n);

        return sqrt * sqrt == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t > 0) {
            int n = sc.nextInt();

            if (isPerfectSquare(n)) {
                System.out.println("TRUE");
            } else {
                System.out.println("FALSE");
            }

            t--;
        }

        sc.close();
    }
}