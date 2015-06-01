package players;

public class Devil extends Creature {

    public void devilsSuperAttack(Human human) {
        System.out.println("\nDevil says: 'Wha-ha-ha! 666 is my favorite number! Your are destroyed!'\n");
        human.hunterBiggestMistake();
    }

    @Override
    public String getName() {
        return "Devil";
    }
}
