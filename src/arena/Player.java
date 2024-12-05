package arena;

/**
 * Player class represents a player in the Magical Arena.
 * Each player has health, strength, and attack attributes.
 */
public class Player {
    private String name;
    private int health;
    private int strength;
    private int attack;

    // Constructor
    public Player(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    // Getter for health
    public int getHealth() {
        return health;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for strength
    public int getStrength() {
        return strength;
    }

    // Getter for attack
    public int getAttack() {
        return attack;
    }

    // Reduces health by a specific amount of damage
    public void reduceHealth(int damage) {
        this.health = Math.max(0, this.health - damage);
    }

    // Checks if the player is alive
    public boolean isAlive() {
        return this.health > 0;
    }
}
