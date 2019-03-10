package UnitTests;

import Framework.Dice;

import org.junit.*;
import static org.junit.Assert.assertTrue;

public class DiceTest {

    private Dice dice1;
    private Dice dice2;

    /**
     * Compares dice numbers
     * true if dice1 > dice2
     */
    @Test
    public void higherDiceTest(){
        dice1 = new Dice(6,4);
        dice2 = new Dice(6,5);
        assertTrue(dice1.compareTo(dice2)==1);
    }

    /**
     * Compares dice numbers
     * true if dice1 < dice2
     */
    @Test
    public void LowerDiceTest(){
        dice1 = new Dice(6,4);
        dice2 = new Dice(6,5);
        assertTrue(dice2.compareTo(dice1)==-1);
    }

    /**
     * Compares dice numbers
     * true if dices are the same
     */
    @Test
    public void sameDiceTest(){
        dice1 = new Dice(6,4);
        assertTrue(dice1.compareTo(dice1)==0);
    }

    /**
     * Checks if a dice is null
     * and returns an exception if so
     */
    @Test(expected=NullPointerException.class)
    public void nullDiceTest(){
        dice1 = new Dice(6,4);
        dice1.compareTo(null);
    }
}
