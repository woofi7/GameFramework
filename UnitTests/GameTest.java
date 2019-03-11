package UnitTests;

import Framework.Dice;
import Framework.Game;
import Framework.Player;
import Framework.DiceCollection;
import org.junit.*;
import static org.junit.Assert.*;

public class GameTest {

    Game game;
    Player player1;
    Player player2;
    Dice dice1;
    Dice dice2;

    /**
     * To do before: Init game
     */
    @Before
    public void before(){
        game = new Game();
        player1 = new Player();
        player2 = new Player();
        dice1 = new Dice();
        dice2 = new Dice();
    }

    /**
     * Creates a new game with 2 players added to a collection
     * returns true if a game is fully initialized with 2 players
     */
    @Test
    public void createGameTest(){
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.startGame();
        assertEquals(2, game.getPlayers().size());
    }

    /**
     * Adds players with dice collections to a game
     * returns true if the second item of the collection is player1
     */
    @Test
    public void playerIteratorTest(){
        dice1 = new Dice(6,2);
        dice2 = new Dice(6,4);

        DiceCollection dc = new DiceCollection(2);
        dc.add(dice1);
        dc.add(dice2);
        player1.addDices(dc);
        player2.addDices(dc);

        game.addPlayer(player2);
        game.addPlayer(player1);

        assertEquals(player1, game.getPlayers().iterator().next());
    }

    /**
     * Creates a new game with a player and some dices to add up
     * returns
     */
    @Test
    public void diceCollectionTest(){
        dice1 = new Dice(6,2);
        dice2 = new Dice(6,4);
        DiceCollection dc = new DiceCollection(2);
        dc.add(dice1);
        dc.add(dice2);
        Dice dice3 = (Dice)dc.iterator().next();
        assertEquals(dice2, dice3);
    }

    /**
     * Creates a new game with a player and some dices to add up
     * returns
     */
    @Test
    public void diceShuffleTest(){
        dice1 = new Dice(6,2);
        dice2 = new Dice(6,4);
        DiceCollection dc = new DiceCollection(2);
        dc.add(dice1);
        dc.add(dice2);
        Dice dice3 = (Dice) dc.iterator().next();
        dice3.shuffle();
        assertNotEquals(dice1.getCurrentValue(), dice3.getCurrentValue());
    }
}
