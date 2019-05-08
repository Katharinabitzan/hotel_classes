import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<Booking> bookings;

    public Hotel(ArrayList rooms){

        this.bedrooms = rooms;
        this.bookings = new ArrayList<>();
    }

    public void checkInGuestToBedroom(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
        bookRoom(bedroom, 5, 2);
    }

    public void checkInGuestToBar(Guest guest, Bar bar) {
        bar.addGuest(guest);
    }

    public void checkInGuestToConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.addGuest(guest);
    }

    public int getBookings() {
        return bookings.size();
    }

    public Booking bookRoom(Bedroom bedroom, int nights, int guests) {
        Booking newBooking = new Booking(bedroom, nights, guests);
        bookings.add(newBooking);
        return newBooking;
    }

    public int returnBill(Booking booking) {
        return booking.getNights() * booking.getNumberOfGuests() * booking.getBedroom().getRate();
    }

    public int getBedrooms() {
        return bedrooms.size();
    }

    public int vacantBedrooms() {
        ArrayList array = new ArrayList<Integer>();

        for (int i = 0; i < bedrooms.size(); i++) {
            if (!bedrooms.get(i).isOccupied()) {
                array.add(bedrooms.get(i).getRoomNumber());
            }
        }
        return array.size();
    }

    public void checkGuestsOut(Bedroom bedroom) {
        bedroom.removeGuests();
    }

}
