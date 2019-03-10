package Games.Bunco;

import Framework.Game;
import Framework.IGameFactory;

public class BuncoTemplate implements IGameFactory {

    @Override
    public Game initializeGame(int playerNb) {
        BuncoGame game = new BuncoGame(playerNb);
        return game;
    }
}
