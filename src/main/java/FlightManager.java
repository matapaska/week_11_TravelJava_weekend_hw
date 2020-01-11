public class FlightManager {

    private Flight flight;
    public FlightManager(Flight flight){
        this.flight = flight;
    }

    public int calculateBagAllowance() {
        return (this.flight.getPlaneType().getPlaneWeight()/2)/this.flight.getPlaneType().getPlaneCapacity();
    }

    public int calculateTotalWeightOfBags() {
        this.flight.countPassengers() * c
    }
}
