package arena;

import java.util.Random;

/**
 * Dice class simulates a 6-sided dice.
 */
public class Dice {
    private Random random;

    // Constructor initializes the random number generator
    public Dice() {
        this.random = new Random();
    }

    // Rolls the dice to generate a number between 1 and 6
    public int roll() {
        return random.nextInt(6) + 1;
    }
}
