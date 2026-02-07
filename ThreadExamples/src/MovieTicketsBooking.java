
public class MovieTicketsBooking {

    int availableSeats;

    public MovieTicketsBooking(int seats) {
        this.availableSeats = seats;
    }

    synchronized void bookmov_tickets(String name, int seatRequire) {

        if (seatRequire <= availableSeats) {
            System.out.println(name + " requested " + seatRequire + " tickets");
            availableSeats = availableSeats - seatRequire;
            System.out.println("Tickets booked for " + name);
            System.out.println("Tickets left: " + availableSeats);
        } else {
            System.out.println("Sorry " + name + ", not enough tickets left");
            System.out.println("Tickets left: " + availableSeats);
        }
        System.out.println();
    }
}
