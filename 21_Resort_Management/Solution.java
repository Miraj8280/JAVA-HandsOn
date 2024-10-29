import java.util.Scanner;

class Resort {
    // private int resortId;
    // private String resortName;
    private String category;
    private double resortPrice;
    private double resortRating;

    public Resort(int resortId, String resortName, String category, double resortPrice, double resortRating) {
        // this.resortId = resortId;
        // this.resortName = resortName;
        this.category = category;
        this.resortPrice = resortPrice;
        this.resortRating = resortRating;
    }

    public String getCategory() {
        return category;
    }

    public double getResortPrice() {
        return resortPrice;
    }

    public double getResortRating() {
        return resortRating;
    }
}

public class Solution {
    private static int findAvgPrice(Resort[] resorts, String category) {
        double sum = 0;
        int count = 0;

        for (Resort resort : resorts) {
            if (resort.getCategory().equalsIgnoreCase(category) && resort.getResortRating() > 4) {
                sum += resort.getResortPrice();
                count++;
            }
        }

        return count != 0 ? (int) sum / count : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Resort[] resorts = new Resort[4];

        for (int i = 0; i < 4; i++) {
            int resortId = sc.nextInt();
            sc.nextLine();
            String resortName = sc.nextLine();
            String category = sc.nextLine();
            double resortPrice = sc.nextDouble();
            sc.nextLine();
            double resortRating = sc.nextDouble();
            sc.nextLine();

            resorts[i] = new Resort(resortId, resortName, category, resortPrice, resortRating);
        }

        String category = sc.nextLine();
        sc.close();

        int avgPrice = findAvgPrice(resorts, category);

        System.out.println(avgPrice != 0 ? "The average price of " + category + ":" + avgPrice : "No such Resort found");
    }
}
