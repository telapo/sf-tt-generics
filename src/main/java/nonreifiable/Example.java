package nonreifiable;

import contra.Car;
import contra.Vehicle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Example {

    public static <T> T[] asArray(List<T> lv, Class<T> cl) {
        // NOT safe!!! Created Object[], which accepts ANYTHING
        // Needed T[] that accepts only Ts...
//        T[] out = (T[])(new Object[lv.size()]);

        T[] out = (T[])Array.newInstance(cl, lv.size());
        for (int i = 0; i < out.length; i++) {
            out[i] = lv.get(i);
        }
        return out;
    }

    public static void main(String[] args) {
        List<Vehicle> fleet = new ArrayList<>();
        fleet.add(new Vehicle(8, 20));
        fleet.add(new Car(6, 40, 5));
        fleet.add(new Vehicle(9, 0));
        fleet.add(new Vehicle(7, 10));
        fleet.add(new Car(10, 30, 2));

        Vehicle[] va = asArray(fleet, Vehicle.class);

        System.out.println("type of va is " + va.getClass().getName());
        for (Vehicle v : va) {
            System.out.println(v);
        }

    }
}
