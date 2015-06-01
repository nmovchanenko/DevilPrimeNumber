import game.Game;
import players.Devil;
import players.Human;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Devil devil = new Devil();

        Game game = new Game();
        game.fight(human, devil);
    }
}
