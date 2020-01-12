import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

public class Flight {


    private PlaneType plane;
    private int flightNumber;
    private String destination;
    private String departureAirport;
    private LocalTime departureTime;
    private ArrayList<Passenger> passengerList;
    private int[] seats;
    private ArrayList<Integer> bookedSeats;





    public Flight(PlaneType plane, int flightNumber, String destination, String departureAirport, LocalTime departureTime){
        this.passengerList = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.seats = new int[plane.getPlaneCapacity()];
        this.bookedSeats = new ArrayList<Integer>();
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

    public ArrayList<Integer> getBookedSeats() {
        return this.bookedSeats;
    }

    public int[] getSeats(){
        return this.seats;
    }

    public void populateSeats(){
        this.seats = IntStream.iterate(1, n -> n + 1).limit(plane.getPlaneCapacity()).toArray();
    }
    public int generateRandomSeatNumber(int[] seats){
        int randomSeat = new Random().nextInt(seats.length);
        return seats[randomSeat];
    }

    public int countPassengers() {
        return this.passengerList.size();
    }

    public void addPassengers(Passenger passenger) {
        this.passengerList.add(passenger);
    }

    public void assignSeatToPassenger(Passenger passenger, int[] seats){
        this.bookedSeats.add(generateRandomSeatNumber(seats));
        if 

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
