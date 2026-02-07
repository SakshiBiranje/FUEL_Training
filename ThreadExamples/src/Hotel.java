public class Hotel {

    int availableroom = 1;

    synchronized void bookroom(String guestname) {

        if (availableroom > 0) {
            System.out.println(guestname + " is booking a room");
            availableroom--;
            System.out.println("Room booked for " + guestname);
        } else {
            System.out.println("Sorry!! no room left for " + guestname);
        }
    }
}
