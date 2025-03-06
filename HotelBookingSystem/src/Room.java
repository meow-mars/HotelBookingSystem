public class Room {
    private String roomType;
    private boolean isAvailable;
    private double price;
    private int roomQuantity;

    public Room(String roomType, boolean isAvailable, double price, int roomQuantity) {
        this.roomType = roomType;
        this.isAvailable = isAvailable;
        this.price = price;
        this.roomQuantity = roomQuantity;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        if (roomType == null) {
            throw new IllegalArgumentException("Room type cannot be null");
        }
        else{
            this.roomType = roomType;
        }
    }

    public boolean isAvailable() {
        return isAvailable;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        else{
            this.price = price;
        }
    }

    public int getRoomQuantity() {

        if (roomQuantity < 0) {
            throw new IllegalArgumentException("Room number cannot be negative");
        }
        else if (roomQuantity == 0) {
            isAvailable = false;
        }
        return roomQuantity;
    }
    public void setRoomQuantity(int roomQuantity) {
        this.roomQuantity = roomQuantity;

    }

    public void displayRoomDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Available: " + isAvailable);
        System.out.println("Price: " + price);
        System.out.println("Room Left: " + roomQuantity);
    }
}
