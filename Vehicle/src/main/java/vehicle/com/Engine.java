package vehicle.com;

public class Engine {
    private String fuelType;
    private int capacity;

    public Engine(String fuelType, int capacity) {
        this.fuelType = fuelType;
        this.capacity = capacity;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
