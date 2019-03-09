package Framework;

import java.util.Iterator;

public class PlayerIterator implements Iterator {
    private int position;
    private PlayerCollection collection;

    public PlayerIterator(PlayerCollection playerCollection) {
        this.collection = playerCollection;
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
