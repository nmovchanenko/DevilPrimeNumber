package players;

public class Human extends Creature {

    public void attack(int number, Devil devil) {
        if (numberLogic.isPrime(number)) {
            devil.lowHealth();
        } else if (number == 666) {
            devil.devilsSuperAttack(this);
        } else {
            this.lowHealth();
        }
    }

    public void hunterBiggestMistake() {
        this.setHealth(0);
    }

    @Override
    public String getName() {
        return "Human";
    }

}
