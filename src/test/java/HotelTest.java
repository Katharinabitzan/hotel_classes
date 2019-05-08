import org.junit.Before;
import org.junit.Test;

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

    @Before
    public void before() {
        hotel = new Hotel();
        bar = new Bar(150, "Hotel Bar");
        conferenceRoom = new ConferenceRoom(200, "Conference Room");
        bedroom1 = new Bedroom(2, 2, "double", 100);
        bedroom2 = new Bedroom(9, 1, "single", 70);
        guest1 = new Guest();
        guest2 = new Guest();
        guest3 = new Guest();
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

}


