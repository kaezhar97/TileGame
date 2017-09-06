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

       while (player1.getSize()>0||player2.getSize()>0)
       {
           
       }
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
       for (int i=0;i<player1.getSize();i++)
           {
               for (int j=0;j<gameBoard.getSize();j++)
               {
                if (player1.get(i).getLeft()==gameBoard.getTile(j).getLeft())
                {
                    gameBoard.addTile(0,player1.get(i));
                    player1.removeTile(i);
                    player1.addTile();
                }
                else if (player1.get(i).getRight()==gameBoard.getTile(j).getRight())
                {
                    gameBoard.addTile(j,player1.get(i));
                    player1.removeTile(i);
                    player1.addTile();
                }
                else
                {
                    //add rotate() method here once it's done
                }
               }
           }
       
       for (int i=0;i<player2.getSize();i++)
           {
               for (int j=0;j<gameBoard.getSize();j++)
               {
                if (player2.get(i).getLeft()==gameBoard.getTile(j).getLeft())
                {
                    gameBoard.addTile(0,player2.get(i));
                    player2.removeTile(i);
                    player2.addTile();
                }
                else if (player2.get(i).getRight()==gameBoard.getTile(j).getRight())
                {
                    gameBoard.addTile(j,player2.get(i));
                    player2.removeTile(i);
                    player2.addTile();
                }
                else
                {
                    //add rotate() method here once it's done
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
      // temporary return statement so skeleton will compile and run
      return "Hi Mom!" ;
   }
} // end of TileGame class