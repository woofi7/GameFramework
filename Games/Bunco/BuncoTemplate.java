package Games.Bunco;

import Framework.*;

public class BuncoTemplate implements IGameFactory {

    @Override
    public Game initializeGame(int playerNb) {
        BuncoGame game = new BuncoGame();
        for (int i = 0; i < playerNb; i++) {
            DiceCollection dices = createDiceCollection(2, 6);
            Player player = createPlayer(dices);
            game.addPlayer(player);
        }
        game.setNbRounds(6);
        return game;
    }

    private DiceCollection createDiceCollection(int number, int value) {
        DiceCollection dices = new DiceCollection();
        for (int i = 0; i < number; i++) {
            dices.add(new Dice(value));
        }
        return dices;
    }

    private Player createPlayer(DiceCollection dices) {
        Player player = new Player();
        player.addDices(dices);
        return player;
    }
}
