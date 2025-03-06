public class Hotel {
    private final String hotelName;
    private final String hotelAddress;
    private final int totalRooms;

    public Hotel(String hotelName, String hotelAddress, int totalRooms) {
        this.hotelName = hotelName;
        this.hotelAddress = hotelAddress;
        this.totalRooms = totalRooms;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public int getTotalRooms() {
        return totalRooms;
    }

    public void displayHotel() {
        System.out.println("Hotel Name: " + hotelName);
        System.out.println("Hotel Address: " + hotelAddress);
        System.out.println("Total Rooms: " + totalRooms);
    }
}
