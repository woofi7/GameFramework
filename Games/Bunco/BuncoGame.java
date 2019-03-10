package Games.Bunco;

public class BuncoGame {

    protected boolean gameWon = true;
    private ScoreStrategieBunco buncoGame;

    /**
     * Partie de bunco
     */
    public void playBunco() {
        createGame();
        while (!gameWon) {
            //playRound();
            //buncoGame.computeScore();
            //gameWon = buncoGame.checkWinner();
        }
        //gameOver();
    }

    /**
     * Initialisation d'une partie
     */
    private void createGame() {
        BuncoTemplate creationTemplate = new BuncoTemplate();
        creationTemplate.initializeGame(3, 2);

        ScoreStrategieBunco buncoGame = new ScoreStrategieBunco();
        gameWon = false;
    }
}
