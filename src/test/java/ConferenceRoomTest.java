import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest1;


    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(200, "Conference Room");
        guest1 = new Guest();
    }

    @Test
    public void hasCapacity(){
        assertEquals(200, conferenceRoom.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("Conference Room", conferenceRoom.getName());
    }

    @Test
    public void hasGuests(){
        assertEquals(0, conferenceRoom.getNumberOfGuests());
    }

    @Test
    public void canAddGuest(){
        conferenceRoom.addGuest(guest1);
        assertEquals(1, conferenceRoom.getNumberOfGuests());
    }
}