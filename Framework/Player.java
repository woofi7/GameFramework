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

    public void setScore(int score) { this.score = score; }

    public void addDices(DiceCollection dices) {
        this.dices = dices;
    }

    public int[] shuffleDices() {
        int[] value = new int[dices.size()];
        for (int i = 0; i < dices.size(); i++) {
            value[i] = ((Dice) dices.get(i)).shuffle();
        }
        return value;
    }

    @Override
    public int compareTo(Object o) {
        Player player = (Player) o;
        return Integer.compare(player.getScore(), this.score);
    }

    public void incrementScore(int value) {
        if (value > 0) {
            score += value;
        }
    }
}
