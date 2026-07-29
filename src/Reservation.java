public class Reservation {
    String reservationId;
    Guest guest;
    Room room;
    int numberOfNights;

    public Reservation(String reservationId, Guest guest, Room room, int numberOfNights) {
        this.reservationId = reservationId;
        this.guest = guest;
        this.room = room;
        this.numberOfNights = numberOfNights;
    }

    public double calculateTotalBill() {
        return room.calculateRoomCharge(numberOfNights);
    }

    public void displayReservationDetails() {
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("--- Guest Details ---");
        guest.displayGuestDetails();
        System.out.println("--- Room Details ---");
        room.displayRoomDetails();
        System.out.println("Number of Nights: " + numberOfNights);
        System.out.println("Total Bill: Rs. " + calculateTotalBill());
        System.out.println();
    }
}
