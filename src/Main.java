public class Main {
    public static void main(String[] args) {
        Guest guest1 = new Guest("G001", "Nimal Perera", "0771234567");
        Guest guest2 = new Guest("G002", "Kamal Silva", "0719876543");

        Room room1 = new Room("R205", "Deluxe", 8500.00);
        Room room2 = new Room("R306", "Suite", 15000.00);

        Reservation reservation1 = new Reservation("RES001", guest1, room1, 4);
        Reservation reservation2 = new Reservation("RES001", guest2, room1, 5);

        System.out.println("===== Reservation 1 Details =====");
        reservation1.displayReservationDetails();

        System.out.println("===== Reservation 2 Details =====");
        reservation2.displayReservationDetails();
    }
}
