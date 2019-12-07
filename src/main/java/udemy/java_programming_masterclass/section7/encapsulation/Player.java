package udemy.java_programming_masterclass.section7.encapsulation;

public class Player {
    public String playerName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of live points remaining for the player
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
