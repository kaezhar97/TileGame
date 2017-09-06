
import java.util.ArrayList ;
import java.util.Random;

/**
 * A NumberTile is a square tile with an int between 1 and 9, inclusive, on
 * each side
 */
public class NumberTile 
{
    private ArrayList<Integer> tile ;
   
    
    /**
     * Create a NumberTile object using 4 random ints in the range 1..9
     */
    public NumberTile() 
    {
       
       Random generator= new Random ();
       tile=new ArrayList<>();
       int nextNum=0;
       
       for (int i=0;i<4;i++)
       {
        nextNum=generator.nextInt(10);  
        tile.add(nextNum);
       }
       
    }
    
    /**
     * Rotate this tile 90 degrees clockwise
     */
    public void rotate() 
    { 
    }
    
    /**
     * Get the number on the left side of this tile
     * @return the number on the left side of this tile
     */
    public int getLeft()
    {
    	// DO NOT MODIFY THIS METHOD!
        // =========================
        return tile.get(0) ;
    }
    
      /**
     * Get the number on the top side of this tile
     * @return the number on the left side of this tile
     */
    public int getTop()
    {
    	// DO NOT MODIFY THIS METHOD!
        // =========================
        return tile.get(1) ;
    }
    
    /**
     * Get the number on the right side of this tile
     * @return the number on the right side of this tile
     */
    public int getRight() 
    {
        // DO NOT MODIFY THIS METHOD!
        // =========================
        return tile.get(2) ;
    }    
    
    /**
     * Get the number on the bottom side of this tile
     * @return the number on the right side of this tile
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
     * @return the tile as a multi-line String 
     */
    public String toString() 
    {
       // temporary return statement so skeleton will compile and run
        String tileLook="\n"+"   " + getTop()+"\n"+getLeft()+"     "+getRight()+"\n   "+getBottom()+"\n";
        return tileLook;
    }    
} // end of NumberTile class