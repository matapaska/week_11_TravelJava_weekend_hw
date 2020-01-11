import java.time.LocalTime;
import java.util.ArrayList;

public class Flight {


    private PlaneType plane;
    private int flightNumber;
    private String destination;
    private String departureAirport;
    private LocalTime departureTime;
    private ArrayList<Passenger> passengerList;




    public Flight(PlaneType plane, int flightNumber, String destination, String departureAirport, LocalTime departureTime){
        this.passengerList = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public ArrayList<Passenger> getPassengerList() {
        return this.passengerList;
    }

    public int getFlightNum() {
        return this.flightNumber;
    }

    public PlaneType getPlaneType(){
        return this.plane;
    }

    public LocalTime getDepartureTime() {
        return this.departureTime;
    }

    public int countPassengers() {
        return this.passengerList.size();
    }

    public void addPassengers(Passenger passenger) {
        this.passengerList.add(passenger);
    }

    public int countAvailableSeats() {
        return this.plane.getPlaneCapacity() - countPassengers();
    }

    public void bookPassenger(Passenger passenger) {
        if (countAvailableSeats() > 0){
            addPassengers(passenger);
        }
    }
}
