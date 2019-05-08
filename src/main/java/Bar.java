import java.util.ArrayList;

public class Bar {
    private int capacity;
    private String name;
    private ArrayList<Guest> guestsInBar;

    public Bar(int capacity, String name){
        this.capacity = capacity;
        this.name = name;
        this.guestsInBar = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfGuestsInBar() {
        return guestsInBar.size();
    }

    public void addGuest(Guest guest) {
        if (getNumberOfGuestsInBar() < capacity) {
            guestsInBar.add(guest);
        }
    }
}