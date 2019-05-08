import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bar bar;
    ConferenceRoom conferenceRoom;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Booking booking1;
    ArrayList<Bedroom> bedrooms;

    @Before
    public void before() {

        bar = new Bar(150, "Hotel Bar");
        conferenceRoom = new ConferenceRoom(200, "Conference Room");
        bedroom1 = new Bedroom(2, 2, "double", 100);
        bedroom2 = new Bedroom(9, 1, "single", 70);

        guest1 = new Guest();
        guest2 = new Guest();
        guest3 = new Guest();

        bedrooms = new ArrayList<>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        hotel = new Hotel(bedrooms);
        hotel.checkInGuestToBedroom(guest1, bedroom1);
    }

    @Test
    public void canCheckInGuest() {
        hotel.checkInGuestToBedroom(guest1, bedroom1);
        assertEquals(1, bedroom1.numberOfGuests());
    }

    @Test
    public void canCheckInGuestToBar() {
        hotel.checkInGuestToBar(guest1, bar);
        assertEquals(1, bar.getNumberOfGuestsInBar());
    }

    @Test
    public void canCheckInGuestsToConferenceRoom() {
        hotel.checkInGuestToConferenceRoom(guest1, conferenceRoom);
        assertEquals(1, conferenceRoom.getNumberOfGuests());
    }

    @Test
    public void canBookRoom() {
        hotel.bookRoom(bedroom1, 5, 2);
        assertEquals(2, hotel.getBookings());
    }

    @Test
    public void canReturnBill() {
        assertEquals(1000, hotel.returnBill(booking1));
    }

    @Test
    public void hasBedrooms() {
        assertEquals(2, hotel.getBedrooms());
    }

    @Test
    public void canSeeVacantBedrooms() {
        hotel.checkInGuestToBedroom(guest1, bedroom1);
        assertEquals(1, hotel.vacantBedrooms());
    }

}


