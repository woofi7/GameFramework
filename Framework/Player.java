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


    public void addDices(int quantity, int value) {
        for (int i = 0; i < quantity; i++) {
            dices.add(new Dice(value));
        }
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
