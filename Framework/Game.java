package Framework;

public class Game {
    private int nbRounds;
    private PlayerCollection players = new PlayerCollection();
    private int actualRound;

    public void setNbRounds(int number) {
        this.nbRounds = number;
    }

    public int getNbRounds() {
        return nbRounds;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    protected boolean removePlayer(Player player) {
        return players.remove(player);
    }

    public PlayerCollection getPlayers() {
        return players;
    }

    public void startGame() {
        this.actualRound = 1;
    }

    public int getActualRound() {
        return actualRound;
    }

    public void incrementRound() {
        actualRound++;
    }
}
