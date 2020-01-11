import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class FlightManagerTest {
    private FlightManager flightManager;
    private Flight flight;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;



    @Before

    public void  before(){
        flight = new Flight(PlaneType.B3, 1234, "WAW", "EDI", "12.30" );
        passenger1 = new Passenger("Alice", 1);
        passenger2 = new Passenger("Julia", 1);
        passenger3 = new Passenger("Sophia", 1);
        passenger4 = new Passenger("Amelia", 1);


    }

    @Test
    public void shouldCalculateBagWeightAllowancePerPassenger(){
        assertEquals(1, flightManager.calculateBagAllowance());
    }

    @Test
    public void shouldCalculateHowMuchWeightBooked(){
        flight.addPassengers(passenger1);
        flight.addPassengers(passenger2);
        flight.addPassengers(passenger2);
        assertEquals(3, flightManager.calculateTotalWeightOfBags());
    }

}
