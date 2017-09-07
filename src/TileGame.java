
public class TileGame
{
    // instance variable declarations go here

    private Hand player1 = new Hand();

    private Hand p1Copy = new Hand(player1);
    
    

    private Hand player2 = new Hand();

    private Hand p2Copy = new Hand(player2);

    private Board gameBoard = new Board();

    // Create a Tilegame object
    public TileGame()
    {

    }

    // Play the game
    public void play()
    {
        System.out.println("Initial board\n"+gameBoard);
        System.out.println("Initial Player 1 Hand\n"+player1);
        System.out.println("Initial Player 2 Hand\n"+player2);

        while (player1.getSize() > 0 && player2.getSize() > 0)
        {
            System.out.println("\nPlayer 1 is making a move...\n");
            makeMove(player1);
            
            System.out.println("\nPlayer 2 is making a move...\n");
            makeMove(player2);
            
            

        }
    }

    // If the current tile fits in the board, returns the index at which 
    // it will be inserted.  If the tile does not fit, returns -1
    private int getIndexForFit(NumberTile tile)
    {
        //System.out.println("The index method has been called");
       
        for (int i=0;i<gameBoard.getSize();i++)
        {
        
         if (tile.getLeft()==gameBoard.getTile(i).getRight())
         {
             if (!(  (gameBoard.getTile(i)  ==  (gameBoard.getTile(gameBoard.getSize()-1))  )))
             {
                 if (tile.getRight()==gameBoard.getTile(i+1).getLeft())
                 {
                     System.out.println("Put it at position " +(i+1));
                     return i+1;
                 }
             }
             else
             {
                 System.out.println("Put it at position " +(i+1));
                 return i+1;
             }
         }
         
         else if (tile.getRight()==gameBoard.getTile(i).getLeft())
         {
             if (i!=0)
             {
                 if (tile.getLeft()==gameBoard.getTile(i-1).getRight())
                 {
                     System.out.println("Put it at position " +(i));
                     return i;
                 }
             }
             else
             {
                 System.out.println("Put it at position " +(i));
                 return i;
             }
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
        int j=0;
        boolean hasPlayed=false;
        
        while (!hasPlayed)
        {
        while(j<hand.getSize())
        {
            NumberTile currentTile=hand.get(j);
            int rotateCounter=0;
        
            while((rotateCounter<3) && (!hasPlayed))
            {
                System.out.println("Checking the currentTile: \n"+currentTile);
                int index= getIndexForFit(currentTile);
                if (index!=-1)
                {
                    System.out.println("Insert tile in index " + index);
                    gameBoard.addTile(index, currentTile);
                    hand.removeTile(j);
                    hasPlayed=true;
                    System.out.println("\nThis is the board after inserting the new tile\n"+gameBoard);
                    System.out.println("\nThis is the player's hand after that last play\n"+hand);
                    
                }
        
                else
                {
                    System.out.println("Rotate the tile");
                    currentTile.rotate();
                    System.out.println("After rotating \n"+currentTile);
                    rotateCounter++;
                }
                
            }
            j++;
        }
        if(!hasPlayed)
           {
            System.out.println("There are no tiles in the hand that fit in the board. Drawing new tile: \n");
            hand.addTile();
           }
        }
    }

    // Get the results of the game as a humongous multi-line String containing
    // both starting hands, the final board, both final hands, and a message
    // indicating the winner 
    // HINT: call the toString methods of the Hand and Board classes
    public String toString()
    {
        String victoryDecision = "";
        String finalString = "";

        if (player1.getSize() == 0 && player2.getSize() != 0)
        {
            victoryDecision = "Player 1 wins!";
        } 
        
        else if (player1.getSize() != 0 && player2.getSize() == 0)
        {
            victoryDecision = "Player 2 wins!";
        } 
        
        else
        {
            victoryDecision = "It's a tie!";
        }
        // temporary return statement so skeleton will compile and run

        finalString = "\n***** Player 1's Starting Hand *****\n" + p1Copy
                + "\n***** Player 2's Starting Hand *****\n" + p2Copy
                + "\n***** The Final Board *****\n" + gameBoard
                + "\n***** Player 1's Final Hand *****\n" + player1
                + "\n***** Player 2's Final Hand *****\n" + player2 +
                "\n" + victoryDecision;

        return finalString;
    }

} // end of TileGame class
