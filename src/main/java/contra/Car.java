package contra;

public class Car extends Vehicle {
    int numberOfSeats;
    public Car(int fuelLevel, int speed, int seats) {
        super(fuelLevel, speed);
        this.numberOfSeats = seats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfSeats=" + numberOfSeats +
                ", fuelLevel=" + fuelLevel +
                ", speed=" + speed +
                '}';
    }
}
