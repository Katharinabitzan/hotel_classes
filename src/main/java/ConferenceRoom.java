import java.util.ArrayList;

public class ConferenceRoom {
    private int capacity;
    private String name;
    private ArrayList<Guest> guestsInConferenceRoom;

    public ConferenceRoom(int capacity, String name){
        this.capacity = capacity;
        this.name = name;
        this.guestsInConferenceRoom = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfGuests() {
        return guestsInConferenceRoom.size();
    }

    public void addGuest(Guest guest) {
        if (getNumberOfGuests() < capacity) {
            guestsInConferenceRoom.add(guest);
        }
    }
}