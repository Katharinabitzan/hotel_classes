import java.util.HashMap;

public class Hotel {
    private HashMap<String, Integer> rooms;

    public Hotel(){
        this.rooms = new HashMap();
    }

    public void checkInGuestToBedroom(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
    }

    public void checkInGuestToBar(Guest guest, Bar bar) {
        bar.addGuest(guest);
    }

    public void checkInGuestToConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.addGuest(guest);
    }
}
