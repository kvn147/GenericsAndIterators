/**
 * This class instantiates a Pair object for testing purposes
 */
public class ExploringGenerics {

    public static void main(String[] args) {
        Pair<String, Die> die = new Pair<>("My Lucky Die", new Die(6));
        printPairs(die);
    }

    public static <T, S> void printPairs(Pair<T, S> p){
        System.out.println("Item 1: " + p.getFirst());
        System.out.println("Item 2: " + p.getSecond());
        System.out.println(p);
    }
}
