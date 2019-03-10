package Games.Bunco;

import Framework.Game;
import Framework.IScoreStrategie;
import Framework.Player;

public class ScoreStrategieBunco implements IScoreStrategie {

    int winCondition = 0;

    @Override
    public boolean checkWinner(Player player) {
        if (player.getScore() == winCondition) {
            return true;
        }
        return false;
    }

    @Override
    public int computeScore(Player player) {
        //int score = //faire calcul du score player.getDices().getScore en fonction du mode du jeu
        //player.addScore(score);
        return 0;
    }
}
