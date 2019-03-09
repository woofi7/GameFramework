package Framework;

import java.util.Iterator;

public class DiceIterator implements Iterator {
    private int position;
    private DiceCollection collection;

    public DiceIterator(DiceCollection diceCollection) {
        this.collection = diceCollection;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return this.collection.size() > position + 1;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            position++;
            return this.collection.get(position);
        }
        return null;
    }
}
