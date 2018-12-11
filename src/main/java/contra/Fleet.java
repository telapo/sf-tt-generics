package contra;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fleet {

    public static void orderListOfCars(List<Car> lc, Comparator<? super Car> cc) {
        lc.sort(cc);
    }

    public static void main(String[] args) {
        List<Vehicle> fleet = new ArrayList<>();
        fleet.add(new Vehicle(8, 20));
        fleet.add(new Car(6, 40, 5));
        fleet.add(new Vehicle(9, 0));
        fleet.add(new Vehicle(7, 10));
        fleet.add(new Car(10, 30, 2));

        System.out.println("All vehicles:");
        System.out.println(fleet);
        Comparator<Vehicle> cvByFuel = (v1, v2) -> v1.fuelLevel - v2.fuelLevel;

        fleet.sort(cvByFuel);
        System.out.println("All vehicles sorted by fuel:");
        System.out.println(fleet);

        List<Car> myGarage = new ArrayList<>();
        myGarage.add(new Car(7, 10, 5));
        myGarage.add(new Car(6, 10, 5));
        myGarage.add(new Car(9, 10, 5));


        System.out.println("Garage");
        System.out.println(myGarage);

//        myGarage.sort(cvByFuel);
        orderListOfCars(myGarage, cvByFuel);
        System.out.println("Garage ordered");
        System.out.println(myGarage);
    }
}
