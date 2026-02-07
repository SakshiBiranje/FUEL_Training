public class User extends Thread {

    MovieTicketsBooking booking;
    String name;
    int seats;

    public User(MovieTicketsBooking booking, String name, int seats) {
        this.booking = booking;
        this.name = name;
        this.seats = seats;
    }

    public void run() {
        booking.bookmov_tickets(name, seats);
    }

    public static void main(String[] args) {

        MovieTicketsBooking obj = new MovieTicketsBooking(5);

        User u1 = new User(obj, "Akash", 2);
        User u2 = new User(obj, "Deepak", 3);
        User u3 = new User(obj, "Rohit", 2);

        u1.start();
        u2.start();
        u3.start();
    }
}