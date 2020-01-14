import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;

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
        flight = new Flight(PlaneType.B3, 1234, "WAW", "EDI", (LocalTime.of(21,30, 00)) );
        passenger1 = new Passenger("Alice", 1);
        passenger2 = new Passenger("Julia", 1);
        passenger3 = new Passenger("Sophia", 1);
        passenger4 = new Passenger("Amelia", 1);
        flightManager = new FlightManager(flight);



    }

    @Test
    public void shouldCalculateFlightTotalBagWeightAllowance() {
        assertEquals(1.5, flightManager.calculateTotalBagWeightAllowance());
    }

    @Test
    public void shouldCalculateBagWeightAllowancePerPassenger(){
        assertEquals(0.5, flightManager.calculateBagAllowance());
    }

    @Test
    public void shouldCalculateHowMuchWeightBooked(){
        flight.addPassengers(passenger1);
        flight.addPassengers(passenger2);
        flight.addPassengers(passenger3);
        assertEquals(1.5, flightManager.calculateTotalWeightOfBags());
    }

    @Test
    public void shouldCalculateHowMuchBagWeightLeftForFlight(){
        flight.addPassengers(passenger1);
        flight.addPassengers(passenger2);
        assertEquals(0.5, flightManager.calculateLeftWeight());
    }

    @Test
    public void shouldBookPassengerSeatAvailable(){
        flight.addPassengers(passenger1);
        flight.addPassengers(passenger2);
        flight.populateSeats();
        flightManager.bookPassengerOnFlight(flight, passenger4, flight.getSeats());
        assertEquals(3, flight.countPassengers());
        assertEquals("Amelia", flight.getPassengerList().get(2).getName());
        assertEquals(flight, passenger4.getFlight());
//        assertEquals(1, passenger4.getSeatNum());

    }

    @Test
    public void shouldNotBookPassengerSeatsNotAvailable(){
        flight.addPassengers(passenger1);
        flight.addPassengers(passenger2);
        flight.addPassengers(passenger3);
        flightManager.bookPassengerOnFlight(flight, passenger4, flight.getSeats());
        assertEquals(3, flight.countPassengers());
        assertEquals("Sophia", flight.getPassengerList().get(2).getName());
        assertEquals(null, passenger4.getFlight());

    }


}
