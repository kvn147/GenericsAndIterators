/**
 * A class that stores pairs of String objects.  This class could be used for a Pair of Roommates,
 * A Married Couple, A Pair of Bandits, etc
 *
 *   Generic Type
 *    Variable           Meaning
 *       E               Element type in a collection (Set, ArrayList, etc)
 *       K               Key type in a map
 *       V               Value type in a map
 *       T,S,U           General Types
 */
public class Pair<T, S> {

    private T item1;
    private S item2;


    public Pair(T firstElement, S secondElement) {
        item1 = firstElement;
        item2 = secondElement;
    }

    public T getFirst() {
        return item1;
    }

    public S getSecond() {
        return item2;
    }

    public String toString() {
        return "Pair: Item1-" +getFirst() + " Item2-" + getSecond();
    }
}
