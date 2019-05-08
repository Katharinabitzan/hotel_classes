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
    }

    @Test
    public void
}