import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Booking {
    private String guestName;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;


    public String getGuestName() {
        return guestName;
    }
    public LocalDate getCheckInDate() {
        return checkInDate;
    }
    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public Booking(String guestName, LocalDate checkInDate, LocalDate checkOutDate, int roomAssigned) {
        this.guestName = guestName;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public void setGuestName(String guestName){
        if (guestName == null){
            throw new IllegalArgumentException("guestName cannot be null");
        }
        else {
            this.guestName = guestName;
        }
    }

    public void setCheckInDate(LocalDate checkInDate){
        if (checkInDate == null){
            throw new IllegalArgumentException("checkInDate cannot be null");
        }
        else {
            this.checkInDate = checkInDate;
        }
    }
    public void setCheckOutDate(LocalDate checkOutDate){
        if (checkOutDate == null){
            throw new IllegalArgumentException("checkOutDate cannot be null");
        }
        else {
            this.checkOutDate = checkOutDate;
        }
    }

    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Check In Date: " + checkInDate);
        System.out.println("Check Out Date: " + checkOutDate);
    }


}