package contra;

public class Vehicle {
    int fuelLevel;
    int speed;

    public Vehicle(int fuelLevel, int speed) {
        this.fuelLevel = fuelLevel;
        this.speed = speed;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "fuelLevel=" + fuelLevel +
                ", speed=" + speed +
                '}';
    }
}
