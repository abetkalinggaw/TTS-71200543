package vehicle.com;

public abstract class Wagon implements Vehicle {
    private String pullers;
    private Wheel wheel;

    public Wagon(String pullers, Wheel wheel) {
        this.pullers = pullers;
        this.wheel = wheel;
    }

    public String getPullers() {
        return this.pullers;
    }

    public Wheel getWheel() {
        return this.wheel;
    }

    public void setPullers(String pullers) {
        this.pullers = pullers;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}
