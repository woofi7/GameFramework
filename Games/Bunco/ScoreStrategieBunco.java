package Games.Bunco;

import Framework.Game;
import Framework.IScoreStrategie;
import Framework.Player;

public class ScoreStrategieBunco implements IScoreStrategie {
    @Override
    public boolean checkWinner(Player player) {
        return false;
    }

    @Override
    public int computeScore(Player player) {
        return 0;
    }

    @Override
    public Game createGame() {
        return null;
    }
}
