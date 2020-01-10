import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FlightTest {

    private Flight flight;
    private Passenger passenger1;
    private Passenger passenger2;



    @Before

    public void  before(){
        flight = new Flight(PlaneType.B737, 1234, "WAW", "EDI", "12.30" );
        passenger1 = new Passenger("Alice", 3);
        passenger2 = new Passenger("Julia", 5);


    }

    @Test
    public void shouldHaveFlightNumber(){
        assertEquals(1234, flight.getFlightNum());
    }

    @Test
    public void shouldStartWithEmptyPassengerList(){

        assertEquals(0, flight.countPassengers());
    }



}
