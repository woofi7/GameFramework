package UnitTests;

import Games.Bunco.*;
import org.junit.*;
import static org.junit.Assert.*;

public class BuncoGameTest {

    private BuncoTemplate buncoTemplate;

    /**
     * To do before: initialize a game
     */
    @Before
    public void before(){
        buncoTemplate = new BuncoTemplate();
        buncoTemplate.initializeGame(0,0);
    }

    /**
     * Tests the game initialisation
     * true if the factory initializes the game correctly
     */
    @Test
    public void initBuncoTest(){

    }

    /**
     *
     */
    @Test
    public void test1(){

    }
}
