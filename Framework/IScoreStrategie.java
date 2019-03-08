package Framework;

public interface IScoreStrategie {
    public boolean checkWinner(Player player);
    public int computeScore(Player player);
    public Game createGame();
}
