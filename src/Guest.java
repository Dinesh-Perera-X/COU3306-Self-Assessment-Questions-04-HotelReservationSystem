public class Guest {
    String guestId;
    String guestName;
    String contactNumber;

    public Guest(String guestId, String guestName, String contactNumber) {
        this.guestId = guestId;
        this.guestName = guestName;
        this.contactNumber = contactNumber;
    }

    public void displayGuestDetails() {
        System.out.println("Guest ID: " + guestId);
        System.out.println("Guest Name: " + guestName);
        System.out.println("Contact Number: " + contactNumber);
    }
}
