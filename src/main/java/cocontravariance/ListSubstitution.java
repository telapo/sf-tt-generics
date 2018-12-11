package cocontravariance;

import contra.Car;
import contra.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ListSubstitution {

    public static void convertList(List<Vehicle> lv, Function<? super Vehicle, ? extends Vehicle> op) {
        for (int i = 0; i < lv.size(); i++) {
            lv.set(i, op.apply(lv.get(i)));
        }
    }

    public static void main(String[] args) {
        List<Vehicle> fleet = new ArrayList<>();
        fleet.add(new Vehicle(8, 20));
        fleet.add(new Car(6, 40, 5));
        fleet.add(new Vehicle(9, 0));
        fleet.add(new Vehicle(7, 10));
        fleet.add(new Car(10, 30, 2));


        Function<Vehicle, Car> op = v -> new Car(v.getFuelLevel() + 15, v.getSpeed(), 5);
        System.out.println("Initial fleet:");
        System.out.println(fleet);
        convertList(fleet, op);
        System.out.println("New fleet:");
        System.out.println(fleet);

        Function<Object, Car> op2 = v -> new Car(5, 10, 5);
        convertList(fleet, op2);
        System.out.println("New fleet:");
        System.out.println(fleet);

    }
}
