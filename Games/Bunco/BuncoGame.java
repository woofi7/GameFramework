package Games.Bunco;

import Framework.Game;
import Framework.Player;

public class BuncoGame extends Game {
    private ScoreStrategieBunco scoreStrategie;
    private int actualRound;

    public BuncoGame() {
        setNbRounds(6);
        addPlayer(2);

        for (Object player : getPlayers()) {
            ((Player) player).addDices(3, 6);
        }
    }

    public void startGame() {
        createGame();
        while (actualRound < getNbRounds()) {
            playRound(actualRound);
            Player player = scoreStrategie.winner(getPlayers());
            System.out.println(player + " win the game");
            actualRound++;
        }
    }

    private void createGame() {
        BuncoTemplate creationTemplate = new BuncoTemplate();
        creationTemplate.initializeGame(2);

        this.scoreStrategie = new ScoreStrategieBunco();
        this.actualRound = 1;
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
