import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarTest {

    Bar bar;
    Guest guest1;


    @Before
    public void before(){
        bar = new Bar(150, "Hotel Bar");
        guest1 = new Guest();
    }

    @Test
    public void hasCapacity(){
        assertEquals(150, bar.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("Hotel Bar", bar.getName());
    }

    @Test
    public void hasGuests(){
        assertEquals(0, bar.getNumberOfGuestsInBar());
    }

    @Test
    public void canAddGuest(){
        bar.addGuest(guest1);
        assertEquals(1, bar.getNumberOfGuestsInBar());
    }
}