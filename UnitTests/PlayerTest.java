package UnitTests;

import Framework.Player;

import org.junit.*;
import static org.junit.Assert.assertTrue;

public class PlayerTest {

    private Player player1;
    private Player player2;

    /**
     * To do before: player init
     */
    @Before
    public void before(){
        player1 = new Player();
        player2 = new Player();
    }

    /**
     * Adds and compares player scores
     * true if player1's score > player2's score
     */
    @Test
    public void higherPlayerScoreTest(){
        player1.setScore(10);
        player2.setScore(30);
        assertTrue(player1.compareTo(player2)==1);
    }

    /**
     * Adds and compares player scores
     * true if player1's score < player2's score
     */
    @Test
    public void LowerPlayerScoreTest(){
        player1.setScore(10);
        player2.setScore(30);
        assertTrue(player2.compareTo(player1)==-1);
    }

    /**
     * Adds and compares player scores
     * true if players' scores are the same
     */
    @Test
    public void samePlayerScoreTest(){
        player1.setScore(999);
        assertTrue(player1.compareTo(player1)==0);
    }
}

