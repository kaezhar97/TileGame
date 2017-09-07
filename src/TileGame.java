/*
File: TileGame.java
Purpose:
    A class that simulates a full game of tiles. This is the class that conducts the whole game.
    This is the main driver class that calls upon most methods and objects.
*/

/**
 * Simulates a full game of tiles. 
 * 
 *Number tiles are squares with a number from 1 to 9 at each side. A “board” for the game is a sequence of number tiles satisfying 
 *this property:
 *The right side of each tile (except the last) = the left side of the next tile on the board
 *There are 2 players in the game, both of which are the computer. Each player starts with a "hand" of 5 number tiles.  
 *A move is made by a player removing tile from the hand and placing it on the board, if possible.   A tile may be placed on the 
 *board in any of 3 ways:

 *As the new first tile 
 *Between two adjacent tiles
 *As the new last tile

 *A number tile in the players hand can be rotated 90 degrees but once placed on the board its position is fixed  

 *If none of the tiles in the hand can be placed on the board, then one random tile is added to the player's hand 

 *A round is when player1 makes a move and then player2 makes a move (to make the game fair)  


 *The game ends when all tiles are removed from one (or both) player's hand(s).  If one player's hand is empty and the other 
 *player's hand still contains tiles, then the player with the empty hand is the winner.  If both players’ hands are empty, then 
 *the game ends in a tie
 * 
 * @author Octavio Avila-Cardet
 */
public class TileGame
{


    private Hand player1 = new Hand(); //Creates a hand for player 1

    private Hand p1Copy = new Hand(player1); // Saves the starter player 1 hand
    
    

    private Hand player2 = new Hand(); //Creates a hand for player 2

    private Hand p2Copy = new Hand(player2); // Saves the starter player 2 hand

    private Board gameBoard = new Board(); // Creates the starting board with one empty tile
 
    /**
     * Create a Tilegame object.
     */
    public TileGame()
    {
    }
    
    /**
     * Play the game.The game is played for as long as both players have more than one tile in their hands.
     * As soon as one or both players run out of tiles, the game is over. The player with no tiles in his or her hands wins.
     * If both players have an empty hand at the end, then the game ends in a tie.
     */
    public void play()
    {
        //This while loop is used to let the players make moves for as long as they have tiles in their hands
        while (player1.getSize() > 0 && player2.getSize() > 0)
        { 
            makeMove(player1);
            makeMove(player2);
        }
    }
    
    /**
     * Checks if the tile fits in the board. If it does, return the position.
     * If it doesn't, return -1.
     * @param tile the tile that needs to be checked
     * @return the index at which the tile should be inserted or -1 if it doesn't fit
     */
    private int getIndexForFit(NumberTile tile)
    {
        //This for loop is used to traverse the entire board. It compares each tile in the board with the current tile
        for (int i=0;i<gameBoard.getSize();i++)
        {
         //Checks if the left number of the current tile fits with the right number in the board
         if (tile.getLeft()==gameBoard.getTile(i).getRight())
         {
             //If they fit, then check if there are any tiles after the current board tile
             if (!(  (gameBoard.getTile(i)  ==  (gameBoard.getTile(gameBoard.getSize()-1))  )))
             {
                 //If there is at least one more tile after the current board tile, 
                 // then make sure the right number in the current hand tile fits with the left number of the next game board tile
                 if (tile.getRight()==gameBoard.getTile(i+1).getLeft())
                 {
                     //If it does, then the tile should be inserted after the current board tile
                     return i+1;
                 }
             }
             else
             {
                 //This code is executed if there are no tiles after the current game board tile.
                 //This means that the tile can be safely inserted without having to check if it
                 //fits with any other tiles.
                 System.out.println("Put it at position " +(i+1));
                 return i+1;
             }
         }
         
         //If the previous check failed, then check if the right side of the hand tile fits with the left side of the current board tile
         else if (tile.getRight()==gameBoard.getTile(i).getLeft())
         {
             //If it does. Checks if there are any tiles before the current game tile
             if (i!=0)
             {
                 //If there are, then check if the left side of the hand tile fits with the right side of the previous board tile
                 if (tile.getLeft()==gameBoard.getTile(i-1).getRight())
                 {
                     //If it fits, then put the tile before the current board tile
                     return i;
                 }
             }
             
             else
             {
                 // This code is executed if there are no board tiles before the current one.
                 // This means that we can safely put the tile at this position without checking any other board tiles.
                 return i;
             }
         }
        }
        //If the tile does not fit anywhere, then return -1
        return -1; 
         
    }

    /** Make a move from a hand. If a tile in the hand fits on the board
     *  then remove it from the hand and place it in the board. The tile may
     *  be rotated up to 3 times.  If no tile from the hand fits, then add
     *  another tile to the hand
     * 
     * @param hand the hand of the player that is making the move
     */   
    private void makeMove(Hand hand)
    {
        int j=0; //Loop variable that keeps track of the index of the current hand tile
        boolean hasPlayed=false; //Stores whether or not the player has made his or her move
        
        //As long as the player has not made a move, he or she will continue to check his or her hand and draw new tiles as needed
        while (!hasPlayed)
        {
        //This loop is going to run for as long as there are tiles in the player's hand
        while(j<hand.getSize())
        {
            NumberTile currentTile=hand.get(j); //Saves the value of the current player's hand
            int rotateCounter=0; //A counter that keeps track of how many times the player has rotated a certain tile
        
            //The player can only rotate each tile 3 times. This loop will run for as long as the player can make rotations 
            //and the player has not made a move yet
            while((rotateCounter<=3) && (!hasPlayed))
            { 
                int index= getIndexForFit(currentTile); //Checks if the current tile fits anywhere and stores the answer in the index
                
                //If the tile fits somewhere, then execute this code
                if (index!=-1)
                {
                    gameBoard.addTile(index, currentTile); //Add the tile to the index where it fits
                    hand.removeTile(j); //Remove the tile from the player's hand
                    hasPlayed=true; //Let the computer know that the player has made a move. Now, it's player 2's turn
                }
                
                //If the tile does not fit anywhere, then rotate it
                else
                {
                    currentTile.rotate(); //Rotates the tile
                    rotateCounter++; //Adds one to the rotating counter. The player can only rotate the tile 3 times
                }
                
            }
            j++; //Increments the loop variable to move on to the next tile
        }
        //If the player has checked all tiles in the hand but he or she has not been able to make a play yet. Then add a new tile to the hand
        if(!hasPlayed)
           {
            hand.addTile(); //Adds a new tile to the hand which will keep the player playing until he or she can add a tile to the board
           }
        }
    }

    
    
    /**
     * Get the results of the game as a multi-line String containing
     * both starting hands, the final board, both final hands, and a message
     * indicating the winner.
     * 
     * @return the final string which shows both player's final hands 
     * and the final board as well as the winner
     */
    public String toString()
    {
        String victoryDecision = ""; //A string that will store the victory decision
        String finalString = ""; //The final string which includes the entire message

        //Checks if player 1's hand is empty but player 2's is not
        if (player1.getSize() == 0 && player2.getSize() != 0)
        {
            victoryDecision = "Player 1 wins!"; //In that case, player 1 is the winner
        } 
        
        //Checks if player 1's hand is not empty but player 2's is
        else if (player1.getSize() != 0 && player2.getSize() == 0)
        {
            victoryDecision = "Player 2 wins!"; //In this case, player 2 is the winner
        } 
        
        else
        {
            victoryDecision = "It's a tie!"; //If both of them have empty hands, then it is a tie
        }
       
        //The final message includes everything. Player 1 and 2's starting hands and the final board as well as the vicory decision
        finalString = "\n***** Player 1's Starting Hand *****\n" + p1Copy
                + "\n***** Player 2's Starting Hand *****\n" + p2Copy
                + "\n***** The Final Board *****\n" + gameBoard
                + "\n***** Player 1's Final Hand *****\n" + player1
                + "\n***** Player 2's Final Hand *****\n" + player2 +
                "\n" + victoryDecision;

        return finalString;
    }

} // end of TileGame class
