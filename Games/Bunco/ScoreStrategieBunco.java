package Games.Bunco;

import Framework.IScoreStrategie;
import Framework.Player;
import Framework.PlayerCollection;

public class ScoreStrategieBunco implements IScoreStrategie {
    @Override
    public Player winner(PlayerCollection players) {
        Player winner = new Player();
        for (int i = 0; i < players.size(); i++) {
            Player player = (Player) players.get(i);

            if (player.compareTo(winner) > 0) {
                winner = player;
            }
        }
        return winner;
    }

    @Override
    public int computeScore(int[] dices, int round) {
        boolean bunco = true;
        for (int dice : dices) {
            if (dice != round) {
                bunco = false;
                break;
            }
        }
        if (bunco) {
            return 21;
        } else {
            boolean sameValue = true;
            for (int dice : dices) {
                if (dice != dices[0]) {
                    sameValue = false;
                    break;
                }
            }
            if (sameValue) {
                return 5;
            } else {
                int score = 0;
                for (int dice : dices) {
                    if (dice == round) {
                        score++;
                    }
                }
                return score;
            }
        }
    }
}
