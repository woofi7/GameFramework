package Framework;

public class Game {
    private int nbRounds;
    private PlayerCollection players;

    public void setPlayerDices(int quantity, int value){
        for (Object player : players) {
            Player p = (Player) player;
            p.addDices(quantity, value);
        }
    }

    protected void setNbRounds(int number) {
        this.nbRounds = number;
    }

    protected int getNbRounds() {
        return nbRounds;
    }

    protected void addPlayer(int number) {
        for (int i = 0; i < number; i++) {
            players.add(new Player());
        }
    }

    protected void addPlayer() {
        addPlayer(1);
    }

    protected boolean removePlayer(Player player) {
        return players.remove(player);
    }

    protected PlayerCollection getPlayers() {
        return players;
    }

}
