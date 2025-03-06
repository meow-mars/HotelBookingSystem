import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Hotel Sunside = new Hotel ("Sunside Hotel","532 Alpaca Way", 17);
        Room sunsideStandard = new Room("Standard",true,120.00,10);
        Room sunsideDeluxe = new Room("Deluxe", true, 200.00, 5);
        Room sunsidePresident = new Room("President",true,350.00,2);

        Hotel Sheraton = new Hotel ("Sheraton Hotel","32 Camel Street", 41);
        Room sheratonStandard = new Room("Standard",true,120.00,20);
        Room sheratonDeluxe = new Room("Deluxe", true, 200.00, 15);
        Room sheratonPresident = new Room("President",true,350.00,6);
        while (true) {
                System.out.println("Would you like to make a reservation? ");
                String input = sc.nextLine();
                if (input.equalsIgnoreCase("Yes")) {
                    System.out.println("What is your name? ");
                    String name = sc.nextLine();
                    System.out.println("What is your check-in date? (YYYY-MM-DD)");
                    String checkin = sc.nextLine();
                    LocalDate checkinDate = LocalDate.parse(checkin);
                    System.out.println("What is your check-out date? (YYYY-MM-DD)");
                    String checkout = sc.nextLine();
                    LocalDate checkoutDate = LocalDate.parse(checkout);
                    int dateDifference = Period.between(checkinDate, checkoutDate).getDays();
                    Booking guest = new Booking(name, checkinDate, checkoutDate, dateDifference);

                    Sheraton.displayHotel();
                    System.out.println("----------------");
                    Sunside.displayHotel();
                    while (true) {
                        System.out.println("Which hotel would you like to book? (Sheraton/Sunside)");
                        String hotel = sc.nextLine();

                        if (hotel.equals("Sheraton")) {
                            sheratonStandard.displayRoomDetails();
                            System.out.println("----------------");
                            sheratonDeluxe.displayRoomDetails();
                            System.out.println("----------------");
                            sheratonPresident.displayRoomDetails();
                            System.out.println("----------------");
                            while (true) {
                                System.out.println("Which room type would you like to book? (Standard/Deluxe/President)");
                                String roomWanted = sc.nextLine();
                                if (roomWanted.equals("Standard")) {
                                    guest.displayBookingDetails();
                                    System.out.println("Your total stay duration is " + dateDifference + " days");
                                    System.out.println("Total cost: $" + (dateDifference * 120));
                                    sheratonStandard.setRoomQuantity(sheratonStandard.getRoomQuantity() - 1);
                                    break;
                                } else if (roomWanted.equals("Deluxe")) {
                                    guest.displayBookingDetails();
                                    System.out.println("Your total stay duration is " + dateDifference + " days");
                                    System.out.println("Total cost: $" + (dateDifference * 200));
                                    sheratonDeluxe.setRoomQuantity(sheratonDeluxe.getRoomQuantity() - 1);
                                    break;
                                } else if (roomWanted.equals("President")) {
                                    guest.displayBookingDetails();
                                    System.out.println("Your total stay duration is " + dateDifference + " days");
                                    System.out.println("Total cost: $" + (dateDifference * 350));
                                    sheratonPresident.setRoomQuantity(sheratonPresident.getRoomQuantity() - 1);
                                    break;
                                } else {
                                    System.out.println("Please input a valid room type");
                                    continue;
                                }
                            }
                            break;
                        } else if (hotel.equals("Sunside")) {
                            sunsideStandard.displayRoomDetails();
                            System.out.println("----------------");
                            sunsideDeluxe.displayRoomDetails();
                            System.out.println("----------------");
                            sunsidePresident.displayRoomDetails();


                            while (true) {
                                System.out.println("Which room type would you like to book? (Standard/Deluxe/President)");
                                String roomWanted = sc.nextLine();
                                if (roomWanted.equals("Standard")) {
                                    guest.displayBookingDetails();
                                    System.out.println("Your total stay duration is " + dateDifference + " days");
                                    System.out.println("Total cost: $" + (dateDifference * 120));
                                    sunsideStandard.setRoomQuantity(sunsideStandard.getRoomQuantity() - 1);
                                    break;
                                } else if (roomWanted.equals("Deluxe")) {
                                    guest.displayBookingDetails();
                                    System.out.println("Your total stay duration is " + dateDifference + " days");
                                    System.out.println("Total cost: $" + (dateDifference * 200));
                                    sunsideDeluxe.setRoomQuantity(sunsideDeluxe.getRoomQuantity() - 1);
                                    break;
                                } else if (roomWanted.equals("President")) {
                                    guest.displayBookingDetails();
                                    System.out.println("Your total stay duration is " + dateDifference + " days");
                                    System.out.println("Total cost: $" + (dateDifference * 350));
                                    sunsidePresident.setRoomQuantity(sunsidePresident.getRoomQuantity() - 1);
                                    break;
                                } else {
                                    System.out.println("Please input a valid room type");
                                    continue;
                                }
                            }

                            break;
                        } else {
                            System.out.println("Please enter a valid hotel name");
                            continue;
                        }
                    }


                }
                if (input.equalsIgnoreCase("No")) {
                    break;
                }
        }

    }
}