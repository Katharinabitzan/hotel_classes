import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class BedroomTest {

    Bedroom bedroom1;
    Bedroom bedroom2;
    Guest guest1;


    @Before
    public void before(){
        bedroom1 = new Bedroom(2, 2, "double", 100);
        bedroom2 = new Bedroom(9, 1, "single", 70);
        guest1 = new Guest();

    }

    @Test
    public void hasRoomNumber(){
        assertEquals(2, bedroom1.getRoomNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom1.getCapacity());
    }

    @Test
    public void hasType(){
        assertEquals("double", bedroom1.getType());
    }

    @Test
    public void hasRate(){
        assertEquals(100, bedroom1.getRate());
    }

    @Test
    public void isOccupied(){
        assertEquals(false, bedroom1.isOccupied());
    }

    @Test
    public void hasGuests(){
        assertEquals(0, bedroom1.numberOfGuests());
    }

    @Test
    public void canAddGuest() {
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.numberOfGuests());
        assertEquals(true, bedroom1.isOccupied());
    }
}
