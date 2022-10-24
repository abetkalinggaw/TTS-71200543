package vehicle.com;

public class Truck extends MotorVehicle{
    private int capacity;

    public Truck(Engine engine, Transmision transmision, Tire tire, Wheel wheel, int capacity) {
        super(engine, tire, wheel, transmision);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void backward() {

    }

    public void brake() {

    }

    public void forward() {

    }

    public void turnLeft() {

    }

    public void turnRight() {

    }
}
