package Framework;

import java.util.Collection;
import java.util.Iterator;

public class DiceCollection implements Collection, Iterable {
    private Dice[] dices;
    private int size;

    public DiceCollection() {
        this.dices = new Dice[0];
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
        for (Dice dice : dices) {
            if (dice.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return new DiceIterator(this);
    }

    @Override
    public Object[] toArray() {
        return dices.clone();
    }

    @Override
    public boolean add(Object o) {
        if (size >= dices.length) {
            Dice[] newDices = new Dice[size + 2];
            System.arraycopy(dices, 0, newDices, 0, dices.length);
            dices = newDices;
        }

        dices[size] = (Dice) o;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (size == 0) {
            return false;
        }

        Dice[] newDices = new Dice[dices.length];

        int j = 0;
        for (Dice dice : dices) {
            if (!dice.equals(o)) {
                newDices[j] = dice;
                j++;
                size--;
            }
        }
        dices = newDices;
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
        return dices[position];
    }
}
