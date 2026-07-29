public class Room {
    String roomNumber;
    String roomType;
    double pricePerNight;

    public Room(String roomNumber, String roomType, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }

    public void displayRoomDetails() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Price Per Night: Rs. " + pricePerNight);
    }

    public double calculateRoomCharge(int numberOfNights) {
        return pricePerNight * numberOfNights;
    }
}
