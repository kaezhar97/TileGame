public class TileGame
{
   // instance variable declarations go here
   private Hand player1=new Hand();
   private Hand p1Copy=new Hand(player1);
       
   private Hand player2=new Hand();
   private Hand p2Copy=new Hand(player2);
   
   private Board gameBoard = new Board ();
   
   // Create a Tilegame object
   public TileGame()
   {
   }
   
   // Play the game
   public void play()
   {

       while (player1.getSize()>0&&player2.getSize()>0)
       {
         
           makeMove(player1);
           makeMove(player2);

       }
   }

   // If the current tile fits in the board, returns the index at which 
   // it will be inserted.  If the tile does not fit, returns -1
   private int getIndexForFit(NumberTile tile)
   {
      // temporary return statement so skeleton will compile and run
       for(int i = 0 ; i<gameBoard.getSize();i++)
       {
         if (tile.getLeft()==gameBoard.getTile(i).getLeft())
           {
            return 0;
           }
         else if (tile.getRight()==gameBoard.getTile(i).getRight())
         {
            return i; 
         }
         
       }
       
       return -1;
   }

   // Make a move from a hand. If a tile in the hand fits on the board
   // then remove it from the hand and place it in the board. The tile may
   // be rotated up to 3 times.  If no tile from the hand fits, then add
   // another tile to the hand  
   private void makeMove(Hand hand)
   {   
       int rotationCounter=0;
     if (rotationCounter<3) 
     {
       for (int j=0;j<hand.getSize();j++)
       {
           if (getIndexForFit(hand.get(j))!=-1)
           {
            gameBoard.addTile(getIndexForFit(hand.get(j)),hand.get(j));
           }
           else
           {
               
             hand.get(j).rotate();
             rotationCounter++;
           }
       }
     }
   }

   
   // Get the results of the game as a humongous multi-line String containing
   // both starting hands, the final board, both final hands, and a message
   // indicating the winner 
   // HINT: call the toString methods of the Hand and Board classes
   public String toString()
   {
         boolean player1Wins=false;
         boolean player2Wins=false;
         boolean tie=false;
       
         if (player1.getSize()==0&&player2.getSize()!=0)
           {
               return "Player 1 wins!";
           }
           
         else if(player1.getSize()!=0&&player2.getSize()==0)
           {
               return "Player 2 wins!";
           }
           
         else
           {
               return "It's a tie!";
           }
      // temporary return statement so skeleton will compile and run
      
   }
} // end of TileGame class