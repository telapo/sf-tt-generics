package simple;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UseAList {
    public static void breakAList(List l) {
        l.add(1, LocalDate.now());
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList(
                "Alan"
        ));
        names.add("Fred");
        names.add("Jim");
        names.add("Sheila");

//        breakAList(names);
//        names.add(LocalDate.now());

        System.out.println(names);
        System.out.println("Name at index 1 is " + names.get(1));
        String n1 = names.get(1);
    }
}
