package clothing;

public class ClothingPair<E extends Sized & Colored/*, F*/> extends Pair<E> {
//    F data = "Hello";
    public ClothingPair(E left, E right) {
        super(left, right);
    }

    public boolean isMatched() {
        return left.getSize() == right.getSize()
                && left.getColor().equals(right.getColor());
    }

    public static <E extends /* Object &*/ Sized & Colored> boolean match(E left, E right) {
        return left.getSize() == right.getSize()
                && left.getColor().equals(right.getColor());
    }
}
