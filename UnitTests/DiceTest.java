package UnitTests;

import Framework.Dice;

import org.junit.*;
import static org.junit.Assert.*;

public class DiceTest {

    private Dice dice1;
    private Dice dice2;

    /**
     * To do before: dice init
     */
    @Before
    public void before(){
        dice1 = new Dice();
        dice2 = new Dice();
    }

    /**
     * Compares dice numbers
     * true if dice1 > dice2
     */
    @Test
    public void HigherDiceTest(){
        //dice1.setFaceObtenue(4);
        //dice2.setFaceObtenue(5);
        assertTrue(dice1.compareTo(dice2)==1);
    }

    /**
     * Compares dice numbers
     * true if dice1 < dice2
     */
    @Test
    public void LowerDiceTest(){
        //dice1.setFaceObtenue(4);
        //dice2.setFaceObtenue(5);
        assertTrue(dice2.compareTo(dice1)==-1);
    }

    /**
     * Compares dice numbers
     * true if dices are the same
     */
    @Test
    public void sameDiceTest(){
        //dice1.setFaceObtenue(4);
        assertTrue(dice1.compareTo(dice1)==0);
    }

    /**
     * Checks if a dice is null
     */
    @Test(expected=IllegalArgumentException.class)
    public void NullDiceTest(){
        //dice1.setFaceObtenue(4);
        dice1.compareTo(null);
    }
}
