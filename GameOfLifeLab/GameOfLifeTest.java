
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import info.gridworld.actor.Actor;

/**
 * The test class GameOfLifeTest.
 *
 * @author  @gcschmit
 * @version 19 July 2014
 */
public class GameOfLifeTest
{
    /**
     * Default constructor for test class GameOfLifeTest
     */
    public GameOfLifeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testInitialState()
    {
        /* expected pattern for initial state
         *  (X: alive; -: dead)
         * 
         *    0 1 2 3 4
         *  0 - - X - -
         *  1 - - - - -
         *  2 x x - - -
         *  3 - - - - -
         *  4 - - - - -
         *  
         */
        /*
         *    0 1 2 3 4 5 6 7 8 
         *  0 - - - - - - - - -  
         *  1 - - - - - - - - -
         *  2 - - - - - x - - -
         *  3 - - - - - x - - - 
         *  4 - - x x x - - - -
         *  5 - - - - - - - - -
         *  6 - - - - - - - - - 
         *  7 - - - - - - - - -
         *  8 - - - - - - - - -
         *  
         */
        
        GameOfLife game = new GameOfLife();
        final int ROWS = game.getNumRows();
        final int COLS = game.getNumCols();

        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 2 && col == 5) ||
                        (row == 3 && col == 5) ||
                        (row == 4 && col == 2) ||
                        (row == 4 && col == 3) ||
                        (row == 4 && col == 4))
                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
            }
        }
    }

    @Test
    public void testFinalState()
    {
        /* verify that the actual pattern matches the expected pattern after 3 generations         *  
         */
         /*
         *    0 1 2 3 4 5 6 7 8 
         *  0 - - - - - - - - -  
         *  1 - - - - - - - - -
         *  2 - - x x - - - - -
         *  3 - x - - x - - - - 
         *  4 - - x x - - - - -
         *  5 - - - x - - - - -
         *  6 - - - - - - - - - 
         *  7 - - - - - - - - -
         *  8 - - - - - - - - -
         *  
         */
        
        GameOfLife game = new GameOfLife();
        final int ROWS = game.getNumRows();
        final int COLS = game.getNumCols();
        game.createNextGeneration();
        game.createNextGeneration();
        game.createNextGeneration();
        game.createNextGeneration();
        
        

        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 3 && col == 2) ||
                        (row == 3 && col == 3) ||
                        (row == 4 && col == 1) ||
                        (row == 4 && col == 4) ||
                        (row == 5 && col == 2) ||
                        (row == 5 && col == 3) ||
                        (row == 6 && col == 3)) 
                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
        
                // ...
               }
            }
    }
}
