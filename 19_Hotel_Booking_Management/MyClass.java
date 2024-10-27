import java.util.Scanner;

class Hotel {
    private int hotelId;
    private String hotelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String wifiFacility;
    private double totalBill;

    public Hotel(int hotelId, String hotelName, String dateOfBooking, int noOfRoomsBooked, String wifiFacility,
            double totalBill) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.wifiFacility = wifiFacility;
        this.totalBill = totalBill;
    }

    public int getHotelId() {
        return hotelId;
    }

    public String getDateOfBooking() {
        return dateOfBooking;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public String getWifiFacility() {
        return wifiFacility;
    }

    public int getNoOfRoomsBooked() {
        return noOfRoomsBooked;
    }
}

public class MyClass {
    private static int noOfRoomsBookedInGivenMonth(Hotel[] hotels, String month) {
        int count = 0;

        for (Hotel hotel : hotels) {
            String dateOfBooking = hotel.getDateOfBooking();
            String extractMonth = dateOfBooking.substring(3, 6);

            if (extractMonth.equalsIgnoreCase(month)) {
                count += hotel.getNoOfRoomsBooked();
            }
        }

        return count;
    }

    private static Hotel searchHotelByWifiOption(Hotel[] hotels, String wifi) {
        Hotel highest = null;
        Hotel secondHighest = null;

        for (Hotel hotel : hotels) {
            if (hotel.getWifiFacility().equalsIgnoreCase(wifi)) {
                if (highest == null || hotel.getTotalBill() > highest.getTotalBill()) {
                    secondHighest = highest;
                    highest = hotel;
                } else if (secondHighest == null || hotel.getTotalBill() > secondHighest.getTotalBill()) {
                    secondHighest = hotel;
                }
            }
        }
        
        return secondHighest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel[] hotels = new Hotel[4];

        for (int i = 0; i < 4; i++) {
            int hotelId = sc.nextInt();
            sc.nextLine();
            String hotelName = sc.nextLine();
            String dateOfBooking = sc.nextLine();
            int noOfRoomsBooked = sc.nextInt();
            sc.nextLine();
            String wifiFacility = sc.nextLine();
            double totalBill = sc.nextDouble();
            sc.nextLine();

            hotels[i] = new Hotel(hotelId, hotelName, dateOfBooking, noOfRoomsBooked, wifiFacility, totalBill);
        }

        String month = sc.nextLine();
        String wifi = sc.nextLine();
        sc.close();

        int noOfRooms = noOfRoomsBookedInGivenMonth(hotels, month);
        Hotel hotelWithWifi = searchHotelByWifiOption(hotels, wifi);

        System.out.println(noOfRooms > 0 ? noOfRooms : "No rooms booked in the given month");
        System.out.println(hotelWithWifi != null ? hotelWithWifi.getHotelId() : "No such option available");
    }
}
