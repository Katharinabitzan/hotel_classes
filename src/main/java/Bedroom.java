import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private int capacity;
    private String type;
    private int rate;
    private boolean occupied;
    private ArrayList<Guest> guests;


    public Bedroom(int roomNumber, int capacity, String type, int rate){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.rate = rate;
        this.occupied = false;
        this.guests = new ArrayList<>();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public int getRate() {
        return rate;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public int numberOfGuests() {
        return guests.size();
    }

    public void addGuest(Guest guest) {
        if (numberOfGuests() < capacity && !isOccupied()) {
            guests.add(guest);
            occupied = true;
        }
    }

    public void removeGuests() {
        guests.clear();
    }
}
