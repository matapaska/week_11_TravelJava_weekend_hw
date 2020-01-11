public class Passenger {

    private String name;
    private int numOfBags;
    private Flight flight;
    private int seatNum;

    public Passenger(String name, int numOfBags){
        this.name = name;
        this.numOfBags = numOfBags;
        this.flight = flight;
        this.seatNum = seatNum;
    }


    public String getName() {
        return this.name;
    }


    public int getNumOfBags() {
        return this.numOfBags;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }
}
