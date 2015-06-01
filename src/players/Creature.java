package players;

import game.NumberLogic;

public abstract class Creature {
    protected NumberLogic numberLogic = new NumberLogic();
    private int health = 120;

    public void lowHealth() {
        health -=40;
    }

    public boolean isDead() {
        if (health == 0) {
            System.out.println("\n" + this.getName() + " is dead!");
        }
        return health > 0;
    }

    public void showCurrentHealth() {
        System.out.println(this.getName() + " health is " + this.health);
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract String getName();
}
