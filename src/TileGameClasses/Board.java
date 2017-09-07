
package TileGameClasses;


import java.util.ArrayList;

/*
File: Board.java
Purpose:
    This class simulates board of number tiles. It starts with one number tile. 
    More number tiles are added as the game progresses.
*/


/**
 * A Board is a collection of Number Tiles
 * 
 * @author Octavio Avila-Cardet
 */
public class Board
{
    private ArrayList<NumberTile> board ;//The board is as a list containing NumberTile objects. This is the main variable used to represent the board
    
    /**
     * Create a new Board with one NumberTile
     */
    public Board()
    {
        board=new ArrayList <>(); // Creates a new ArrayList and assignes it to the board. Now the board is an empty list.
        NumberTile initialTile = new NumberTile(); // A new tile is created with random numbers.
        board.add(initialTile); // The created tile is added to the board. This will be the starting board.
    }
    
    /**
     * Get the tile at a specified index on this Board
     * @param index the index (position) of the tile to be returned
     * @return the NumberTile at the specified index
     */
    public NumberTile getTile (int index)
    {
       return board.get(index); 
    }
    
    /**
     * Get the size of this Board
     * @return the number of tiles on the Board
     */
    public int getSize()
    {
       return board.size();
    }
    
    /**
     * Add a new tile to this Board at a specified index (position)
     * @param index the index (position) at which to insert the tile
     * @param tile  the tile to be inserted
     */
    public void addTile(int index, NumberTile tile)
    {
        board.add(index,tile);
    }
    
    /**
     * Get a String representation of this Board
     * @return the NumberTiles on the Board as a multi-line String
     */
    public String toString()
    {
       // DO NOT MODIFY THIS METHOD!
       // ==========================
       return board.toString() ;   // call toString of ArrayList class
    }           
}