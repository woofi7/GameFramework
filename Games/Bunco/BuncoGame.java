package Games.Bunco;

import Framework.Game;
import Framework.Player;

public class BuncoGame extends Game {
    private ScoreStrategieBunco scoreStrategie;

    public BuncoGame() {
        this.scoreStrategie = new ScoreStrategieBunco();
    }
    public ScoreStrategieBunco getRules() { return this.scoreStrategie; }

    public void startGame() {
        super.startGame();
        while (getActualRound() < getNbRounds()) {
            playRound(getActualRound());
            Player player = scoreStrategie.winner(getPlayers());
            System.out.println(player + " win the round");
            incrementRound();
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
}
