public enum PlaneType {

    B3(3, 3),
    B767(250, 250),
    B777(350, 350);

    private final int capacity;
    private final double planeWeight;

    private PlaneType(int capacity, double planeWeight){
        this.capacity = capacity;
        this.planeWeight = planeWeight;
    }

    public int getPlaneCapacity(){
        return this.capacity;
    }

    public double getPlaneWeight() {
        return this.planeWeight;
    }
}
