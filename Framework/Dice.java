package Framework;

import java.util.Random;

public class Dice implements Comparable {
    private int faceNb;
    private int currentValue;
    private Random rand;


    public Dice(int faceNb) {
        this.faceNb = faceNb;
        this.currentValue = 0;
        this.rand = new Random();
    }

    public Dice(int faceNb, int currentValue) {
        this.faceNb = faceNb;
        this.currentValue = currentValue;
        this.rand = new Random();
    }

    public Dice() {
        this(6);
    }

    public int shuffle() {
        currentValue = rand.nextInt(faceNb + 1);
        return currentValue;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    @Override
    public int compareTo(Object o) {
        Dice dice = (Dice) o;
        return Integer.compare(dice.getCurrentValue(), this.currentValue);
    }
}
