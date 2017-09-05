public class TileGame
{
   // instance variable declarations go here
 
   
   // Create a Tilegame object
   public TileGame()
   {
   }
   
   // Play the game
   public void play()
   {
   }

   // If the current tile fits in the board, returns the index at which 
   // it will be inserted.  If the tile does not fit, returns -1
   private int getIndexForFit(NumberTile tile)
   {
      // temporary return statement so skeleton will compile and run
      return -999;
   }

   // Make a move from a hand. If a tile in the hand fits on the board
   // then remove it from the hand and place it in the board. The tile may
   // be rotated up to 3 times.  If no tile from the hand fits, then add
   // another tile to the hand  
   private void makeMove(Hand hand)
   {
   }

   
   // Get the results of the game as a humongous multi-line String containing
   // both starting hands, the final board, both final hands, and a message
   // indicating the winner 
   // HINT: call the toString methods of the Hand and Board classes
   public String toString()
   {
      // temporary return statement so skeleton will compile and run
      return "Hi Mom!" ;
   }
} // end of TileGame class