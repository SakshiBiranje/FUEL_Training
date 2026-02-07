public class Guest extends Thread {

    Hotel hotel;
    String guestName;

    public Guest(Hotel hotel, String guestname) {
        this.hotel = hotel;
        this.guestName = guestname;
    }

    public void run() {
        hotel.bookroom(guestName);
    }

    public static void main(String[] args) {

        Hotel hotel = new Hotel();

        Guest guest1 = new Guest(hotel, "Akash");
        guest1.start();

        Guest guest2 = new Guest(hotel, "Deepak");
        guest2.start();
    }
}