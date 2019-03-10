import Framework.Game;
import Games.Bunco.BuncoGame;
import Games.Bunco.BuncoTemplate;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        BuncoTemplate buncoTemplate = new BuncoTemplate();

        Game game = buncoTemplate.initializeGame(2);
        game.startGame();
    }
}
