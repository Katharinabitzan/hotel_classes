public class Booking {

    private Bedroom bedroom;
    private int nights;
    private int numberOfGuests;

    public Booking(Bedroom bedroom, int nights, int numberOfGuests) {
        this.bedroom = bedroom;
        this.nights = nights;
        this.numberOfGuests = numberOfGuests;
    }


    public Bedroom getBedroom() {
        return bedroom;
    }

    public int getNights() {
        return nights;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }
}
