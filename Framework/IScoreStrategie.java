package Framework;

public interface IScoreStrategie {
    public Player winner(PlayerCollection players);
    public int computeScore(int[] dices, int round);
}
