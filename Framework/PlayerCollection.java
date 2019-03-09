package Framework;

import java.util.Collection;
import java.util.Iterator;

public class PlayerCollection implements Collection {
    private Player[] players;
    private int size;

    public PlayerCollection() {
        this(0);
    }

    public PlayerCollection(int length) {
        this.players = new Player[0];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Player player : players) {
            if (player.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return new PlayerIterator(this);
    }

    @Override
    public Object[] toArray() {
        return players.clone();
    }

    @Override
    public boolean add(Object o) {
        if (size >= players.length) {
            Player[] newPLayers = new Player[size + 2];
            System.arraycopy(players, 0, newPLayers, 0, players.length);
            players = newPLayers;
        }

        players[size] = (Player) o;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (size == 0) {
            return false;
        }

        Player[] newPlayers = new Player[players.length];

        int j = 0;
        for (Player player : players) {
            if (!player.equals(o)) {
                newPlayers[j] = player;
                j++;
                size--;
            }
        }
        players = newPlayers;
        return true;
    }

    @Override
    public boolean addAll(Collection c) {
        for (Object o : c) {
            this.add(o);
        }
        return true;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public boolean retainAll(Collection c) {
        for (Object o : c) {
            if (!this.contains(o)) {
                this.remove(o);
            }
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection c) {
        for (Object o : c) {
            this.remove(o);
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection c) {
        for (Object o : c) {
            if (!this.contains(o)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    public Object get(int position) {
        if (position > size) {
            return null;
        }
        return players[position];
    }
}
