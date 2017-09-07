import java.util.ArrayList;

/*
File: Hand.java
Purpose: 
   This class simulates a real world hand full of tiles. The starting hand consists of 5 tiles
*/


/**
 * A Hand is a collection of NumberTiles.  Tiles may be removed from 
 * the Hand and new tiles added to it
 * 
 * @author Octavio Avila-Cardet
 */
public class Hand
{
    private ArrayList<NumberTile> hand ;  // Creates an ArrayList consisting of tiles. This is the main variable used to represent the hand
    private static int HAND_SIZE = 5 ;   // starting hand size
    
    /**
     * Create a new Hand of HAND_SIZE tiles
     */
    public Hand()
    {
       hand=new ArrayList<>(); //An empty list of tiles is added to the hand
       NumberTile newTile; //A new tile pointer is created
       
       //This for loop is used to populate the hand with tiles
       for (int i=0;i<HAND_SIZE;i++)
       {
         newTile=new NumberTile();// During every iteration of the loop, a new tile is created
         hand.add(newTile);//Then, the tile is added to the hand. This process is repeated HAND_SIZE times. In this way, 5 tiles are added to the hand
       }
  
    }
    
    /**
     * Create a new Hand as an exact duplicate (i.e. a "deep copy") of another.
     * The purpose of this is to save the starting hand to be displayed to the user after the game is over.
     * We need to save a copy of the starting hand because it will be affected throughout the game.
     * @param toBeCopied the Hand to be copied
     */
    public Hand(Hand toBeCopied)
    {
        hand = new ArrayList<>(); //An empty list is added to the hand that will be populated later with values of the original hand
        
        //This for loop is used to populate the hand with all the tiles from the original hand
        for (int i=0;i<toBeCopied.getSize();i++)
        {
            hand.add(toBeCopied.get(i)); //Grab each tile from the original hand and put it in the copy. In this way, a deep copy is achieved.
        }
 
    }
    
    /**
     * Get the tile at a specified index in this Hand
     * @param index the index (position) of the tile to be returned
     * @return the NumberTile at the specified index
     */
    public NumberTile get(int index)
    {
       
       NumberTile tileToShow; //Creates a tile that will be returned by the method later
       tileToShow=hand.get(index); //The created tile is given the value of the tile at the specified index
        
       return tileToShow;
    }
    
    /**
     * Get the size of this Hand
     * @return the number of tiles in the Hand
     */
    public int getSize()
    {
       return hand.size() ;
    }
    
    /**
     * Add a new tile to this Hand
     */
    public void addTile()
    {
        NumberTile newTile; //A new tile is created
        newTile=new NumberTile(); //The tile is given a random tile
        hand.add(newTile); //The random tile is added to the hand
    }
    
    /**
     * Remove the tile at a specified index (position) from this Hand 
     * @param index the index (position) of the tile to be removed
     */
    public void removeTile(int index)
    {
        hand.remove(index);
    }
    
    /**
     * Is this Hand empty? 
     * @return true if this Hand is empty (contains no tiles); otherwise false
     */
    public boolean isEmpty()
    {
       // temporary return statement so skeleton will compile and run
        
       boolean isEmpty; // Variable to check if the hand is empty
       isEmpty=hand.size()==0; //Checks if the hand is empty and stores the result in the boolean variable

       return isEmpty ;
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