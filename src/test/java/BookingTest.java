import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Bedroom bedroom1;
    Bedroom bedroom2;

    Booking booking1;
    Booking booking2;


    @Before
    public void before() {
        bedroom1 = new Bedroom(2, 2, "double", 100);
        bedroom2 = new Bedroom(9, 1, "single", 70);
        booking1 = new Booking(bedroom1, 7, 2);
        booking2 = new Booking(bedroom2, 5, 1);
    }

    @Test
    public void hasBedroom() {
        assertEquals(bedroom1, booking1.getBedroom());
    }

    @Test
    public void hasNights() {
        assertEquals(7, booking1.getNights());
    }

    @Test
    public void hasNumberOfGuests() {
        assertEquals(2, booking1.getNumberOfGuests());
    }

}