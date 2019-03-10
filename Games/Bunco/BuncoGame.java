package Games.Bunco;

import Framework.Game;
import Framework.Player;

public class BuncoGame extends Game {
    private ScoreStrategieBunco scoreStrategie;
    private int actualRound;

    public BuncoGame(int nbPlayers) {
        this.scoreStrategie = new ScoreStrategieBunco();

        setNbRounds(6);
        addPlayer(nbPlayers);

        for (Object player : getPlayers()) {
            ((Player) player).addDices(3, 6);
        }
    }

    public void startGame() {
        this.actualRound = 1;
        while (actualRound < getNbRounds()) {
            playRound(actualRound);
            Player player = scoreStrategie.winner(getPlayers());
            System.out.println(player + " win the game");
            actualRound++;
        }
    }

    public void playRound(int actualRound) {
        for (int i = 0; i < getPlayers().size(); i++) {
            Player p = (Player) getPlayers().get(i);

            boolean playing;
            do {
                playing = true;
                int[] dices = p.shuffleDices();
                int score = scoreStrategie.computeScore(dices, actualRound);
                p.incrementScore(score);
                if (score == 0) {
                    playing = false;
                }
            } while(playing);
        }
    }

    public int getActualRound() {
        return actualRound;
    }

    public void setActualRound(int actualRound) {
        this.actualRound = actualRound;
    }
}
