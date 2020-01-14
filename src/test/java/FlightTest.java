import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.time.LocalTime;

import static junit.framework.TestCase.assertEquals;

public class FlightTest {

    private Flight flight;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;





    @Before

    public void  before(){
        flight = new Flight(PlaneType.B3, 1234, "WAW", "EDI", (LocalTime.of(21,30, 00)));
        passenger1 = new Passenger("Alice", 3);
        passenger2 = new Passenger("Julia", 5);
        passenger3 = new Passenger("Sophia", 8);
        passenger4 = new Passenger("Amelia", 1);



    }

    @Test
    public void shouldHaveFlightNumber(){
        assertEquals(1234, flight.getFlightNum());
    }

    @Test
    public void shouldGetDepartureTime(){
        assertEquals(LocalTime.of(21, 30, 00), flight.getDepartureTime());

    }

    @Test
    public void shouldStartWithEmptyPassengerList(){
        assertEquals(0, flight.countPassengers());
    }

    @Test
    public void shouldGetSeats(){
        assertEquals(3, flight.getSeats().length);
    }

    @Test
    public void shouldPopulateSeats(){
        flight.populateSeats();
        assertEquals(1, (int) Array.get(flight.getSeats(), 0));
    }

//    @Test
//    public void shouldGenerateRandomSeatNumber(){
//        flight.populateSeats();
//        assertEquals(1, flight.generateRandomSeatNumber(flight.getSeats()));
//    }

    @Test
    public void shouldAddPassengers(){
        flight.addPassengers(passenger1);
        assertEquals(1, flight.countPassengers());
    }

    @Test
    public void shouldCountAvailableSeats(){
        flight.addPassengers(passenger1);
        assertEquals(2, flight.countAvailableSeats());
    }

        @Test
    public void shouldAssignSeatToPassenger(){
        flight.populateSeats();
        flight.assignRandomSeatToPassenger(passenger1, flight.getSeats());
        assertEquals(1, passenger1.getSeatNum());
    }








}
