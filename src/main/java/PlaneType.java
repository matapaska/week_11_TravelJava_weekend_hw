public enum PlaneType {

    B3(3, 3),
    B767(250, 250),
    B777(350, 350);

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
