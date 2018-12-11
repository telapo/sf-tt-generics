package clothing;

import java.time.LocalDate;

public class Store {
    public static void main(String[] args) {
        Pair<String> p = new Pair<>("Yellow", "Banana");

        p.setRight("Lemon");
//        p.setRight(LocalDate.now());
        String s = p.getLeft();

        ClothingPair<Shoe> ps = new ClothingPair<>(
                new Shoe(44, "Brown"),
                new Shoe(44, "Black"));

        System.out.println("Do the shoes match? " + ps.isMatched());
    }
}
