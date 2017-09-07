
import java.util.ArrayList ;
import java.util.Random;

/*
File: NumberTile.java
Purpose:
    This class simulates a single number tile. Tiles are held by the players and placed on the board if they fit according to the game rules.
*/

/**
 * A NumberTile is a square tile with an int between 1 and 9, inclusive, on
 * each side.
 * 
 * @author Octavio Avila-Cardet
 */
public class NumberTile 
{
    private ArrayList<Integer> tile ; //A tile is a list of positive numbers.
   
    
    /**
     * Create a NumberTile object using 4 random ints in the range 1..9.
     */
    public NumberTile() 
    {
       
       Random generator= new Random (); // A random object is created to populate the tile with random numbers .
       tile=new ArrayList<>(); // The tile is given an empty list of integers.
       int nextNum=0; //Variable that will store the next number that will be added to the tile.
       
       //This for loop is used to populate the tile with four positive random numbers.
       for (int i=0;i<4;i++)
       {
        nextNum=generator.nextInt(10);  //During each iteration of the loop, a random number is created...
        tile.add(nextNum); //... and added to the tile.
       }
       
    }
    
    /**
     * Rotate this tile 90 degrees clockwise.
     */
    public void rotate() 
    { 
        
        int removedNumber=tile.remove(tile.size()-1); //Removes a number from the end of the tile.
        tile.add(0,removedNumber); //Adds the removed number to the beginning, pushing the other numbers by one place.
    }
    
    /**
     * Get the number on the left side of this tile
     * @return the number on the left side of this tile.
     */
    public int getLeft()
    {
    	// DO NOT MODIFY THIS METHOD!
        // =========================
        return tile.get(0) ;
    }
    
      /**
     * Get the number on the top side of this tile.
     * @return the number on the left side of this tile.
     */
    public int getTop()
    {
    	// DO NOT MODIFY THIS METHOD!
        // =========================
        return tile.get(1) ;
    }
    
    /**
     * Get the number on the right side of this tile.
     * @return the number on the right side of this tile.
     */
    public int getRight() 
    {
        // DO NOT MODIFY THIS METHOD!
        // =========================
        return tile.get(2) ;
    }    
    
    /**
     * Get the number on the bottom side of this tile.
     * @return the number on the right side of this tile.
     */
    public int getBottom() 
    {
        // DO NOT MODIFY THIS METHOD!
        // =========================
        return tile.get(3) ;
    } 
   
    /** 
     * Return a String representation of this tile in the form
     * 
     *    4
     * 5     7
     *    1
     * 
     * @return the tile as a multi-line String.
     */
    public String toString() 
    {
       
        String tileLook="\n"+"   " + getTop()+"\n"+getLeft()+"     "+getRight()+"\n   "+getBottom()+"\n"; //A line-by-line representation of the tile. 
                                                                                                         //The top is the first line, followed by the left and the right. 
                                                                                                         //Lastly, the bottom is the last line
        return tileLook;
    }    
} // End of NumberTile class.