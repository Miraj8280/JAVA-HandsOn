import java.util.Scanner;

class Account {
    private int id;
    private double balance;
    private double interestRate;

    // Constructor with parameters
    public Account(int id, double balance, double interestRate) {
        this.id = id;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    // Getters
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read inputs for Account object
        int id = sc.nextInt();
        double balance = sc.nextDouble();
        double interestRate = sc.nextDouble();

        // Create Account object
        Account account = new Account(id, balance, interestRate);

        // Read noOfYears
        int noOfYears = sc.nextInt();

        sc.close();

        // Calculate and display interest
        double interestAmount = calculateInterest(account, noOfYears);
        System.out.printf("%.3f%n", interestAmount);
    }

    public static double calculateInterest(Account account, int noOfYears) {
        double rateIncrease = account.getInterestRate() * (noOfYears / 100.0);
        double finalInterestRate = account.getInterestRate() + rateIncrease;
        return account.getBalance() * (finalInterestRate / 100.0);
    }
}
