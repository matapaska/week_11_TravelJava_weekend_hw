public enum PlaneType {

    B737(3, 100000),
    B767(250, 200000),
    B777(350, 250000);

    private final int capacity;
    private final int planeWeight;

    private PlaneType(int capacity, int planeWeight){
        this.capacity = capacity;
        this.planeWeight = planeWeight;
    }

    public int getPlaneCapacity(){
        return this.capacity;
    }

    public int getPlaneWeight() {
        return this.planeWeight;
    }
}
