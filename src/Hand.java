import java.util.ArrayList;

/**
 * A Hand is a collection of NumberTiles.  Tiles may be removed from 
 * the Hand and new tiles added to it
 */
public class Hand
{
    private ArrayList<NumberTile> hand ;
    private static int HAND_SIZE = 5 ;          // starting hand size
    
    /**
     * Create a new Hand of HAND_SIZE tiles
     */
    public Hand()
    {
    }
    
    /**
     * Create a new Hand as an exact duplicate (i.e. a "deep copy") of another
     * @param toBeCopied the Hand to be copied
     */
    public Hand(Hand toBeCopied)
    {
    }
    
    /**
     * Get the tile at a specified index in this Hand
     * @param index the index (position) of the tile to be returned
     * @return the NumberTile at the specified index
     */
    public NumberTile get(int index)
    {
       // temporary return statement so skeleton will compile and run
       return null ;
    }
    
    /**
     * Get the size of this Hand
     * @return the number of tiles in the Hand
     */
    public int getSize()
    {
       // temporary return statement so skeleton will compile and run
       return -999 ;
    }
    
    /**
     * Add a new tile to this Hand
     */
    public void addTile()
    {
    }
    
    /**
     * Remove the tile at a specified index (position) from this Hand 
     * @param index the index (position) of the tile to be removed
     *
     */
    public void removeTile(int index)
    {
    }
    
    /**
     * Is this Hand empty? 
     * @return true if this Hand is empty (contains no tiles); otherwise false
     *
     */
    public boolean isEmpty()
    {
       // temporary return statement so skeleton will compile and run
       return true ;
    }
    
    /**
     * Get a String representation of this Hand
     * @return the NumberTiles in this Hand as a multi-line String
     */
    public String toString()
    {
       // DO NOT MODIFY THIS METHOD!
       // ==========================
       return hand.toString() ;     // call toString of ArrayList class
    }
}