import java.util.*;


/**
 *  Iterators allow you to access any collection in a sequential like manner without having to understand
 *  the underlying Collection data structure.  HashSet, TreeSet, and ArrayList are three Collection data structures
 *  we have used in class.  You can easily get an iterator for a collection with the .iterator() method.
 *
 *  Iterator is an interface in the java.util package that has three abstract methods:
 *     Method Name      Description
 *      next()          returns a reference to the next item in the Collection
 *      remove()        removes the last reference returned by next 
 *      hasNext()       checks to see if there are more items
 *
 */
public class ExploringIterators {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList("ape", "ape", "cat", "bat"));
        Set<String> uniqueWords = new TreeSet<>(Arrays.asList("ape", "ape", "cat", "bat"));

        remove(words, "ape");
        remove(uniqueWords, "ape");
        System.out.println("ArrayList contents: "+ words);
        System.out.println("TreeSet contents: " + uniqueWords);

//        traverse(words);
//        traverse(uniqueWords);
       
    }

    // every time there is a public method, in individual assignments add a javadoc

    /**
     * visit each element in the collection and print it out use an iterator
     *
     * @param coll a collection of string object
     */
    public static void traverse(Collection<String> coll){
        // create an iterable object called it
        Iterator<String> it = coll.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();
    }

    /**
     * Find all occurrences of the item in the collection and remove it
     * using an iterator
     *
     * @param coll collection of strings
     * @param item string to remove from the collection
     */
    public static void remove(Collection<String> coll, String item){
        // construct iterator object
        Iterator<String> it = coll.iterator();

        while(it.hasNext()) {
            
            // removes all contents
            it.next();
            it.remove();

//            if (it.next().equals(item)) {
//                it.remove();
//            }
        }
    }
}
