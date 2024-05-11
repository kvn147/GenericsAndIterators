import java.util.Random;

/**
 * This class represents a die that could be "rolled" in a game
 * The die can be constructed with 2 or more sides
 */
public class Die {

    private int numSides;

    /**
     * Contructs one die object with the indicated number of sides
     * @param numSides number of sides on the die
     */
    public Die(int numSides){
        if (numSides <= 1){
            throw new IllegalArgumentException("Number of sides is <= 1: " + numSides);
        }
        this.numSides = numSides;
    }

    /**
     * returns the number of sides on the die
     * @return number of sides
     */
    public int getNumSides(){
        return this.numSides;
    }

    /**
     * returns a pseudo-random number from a die roll
     * @return the number "face-up" on the die
     */
    public int rollDie(){
        return new Random().nextInt(numSides) + 1;
    }

    @Override
    public String toString() {
        return "Die has " + getNumSides() + " sides.";
    }

}
