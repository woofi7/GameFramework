package UnitTests;

import Framework.Game;
import Framework.*;
import Games.Bunco.*;
import org.junit.*;
import static org.junit.Assert.*;

public class BuncoGameTest {

    private BuncoTemplate buncoTemplate;
    private BuncoGame buncoGame;

    /**
     * To do before: initialize a game
     */
    @Before
    public void before(){
        buncoTemplate = new BuncoTemplate();
        buncoGame = new BuncoGame();
    }

    /**
     * Tests the initialisation of a game with 25 players
     */
    @Test
    public void buncoInitTest(){
        Game game = buncoTemplate.initializeGame(25);
        assertEquals(25, game.getPlayers().size());
    }

    /**
     * Tests a full run of the game that ends after 6 rounds
     */
    @Test
    public void buncoRoundsTest(){
        Game game = buncoTemplate.initializeGame(2);
        game.startGame();
        assertEquals(6, game.getNbRounds());
    }

    /**
     * Tests that a winner is elected
     * Return true if player1 wins
     */
    @Test
    public void winnerTest(){
        Game game = buncoTemplate.initializeGame(5);
        Player player1 = new Player();
        player1.setScore(999);
        game.addPlayer(player1);
        assertNotEquals(player1, buncoGame.getRules().winner(game.getPlayers()));
    }

    /**
     * Tests that the game has 2 dices
     */
    @Test
    public void buncoDiceNumberTest(){
        Game game = buncoTemplate.initializeGame(5);
        Player player1 = ((Player) game.getPlayers().get(0));
        DiceCollection dices = player1.getDices();
        assertEquals(2, dices.size());
    }

    /**
     * Tests that the game has 6 faced dices
     */
    @Test
    public void buncoDiceFaceTest(){
        Game game = buncoTemplate.initializeGame(5);
        Player player1 = (Player) game.getPlayers().get(0);
        Dice dice = (Dice) player1.getDices().get(0);
        assertEquals(6, dice.getFaceNb());
    }
}
