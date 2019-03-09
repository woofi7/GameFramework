package Framework;

public class Player implements Comparable {
    private int id;
    private int score;
    private DiceCollection dices;

    public Player(DiceCollection dices) {
        this.dices = dices;
        this.score = 0;
    }

    public Player() {
        this(new DiceCollection());
    }

    public int getScore() {
        return score;
    }

    public DiceCollection getDices() {
        return dices;
    }

    public void setDices(DiceCollection dices) {
        this.dices = dices.clone();
    }

    @Override
    public int compareTo(Object o) {
        Player player = (Player) o;
        return Integer.compare(player.getScore(), this.score);
    }
}
