
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

        while (player1.getSize() > 0 && player2.getSize() > 0)
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
        for (int i = 0; i < gameBoard.getSize(); i++)
        { 
            System.out.println("The game board: \n"+gameBoard);
            System.out.println("The current tile: \n"+tile);
            
            System.out.println("the hand tile's left number:" + tile.getLeft());
            System.out.println("the gameBoard tile's left number:" + gameBoard.getTile(i).getLeft());
            
            System.out.println("the hand tile's right number:" + tile.getRight());
            System.out.println("the gameBoard tile's right number:" + gameBoard.getTile(i).getRight());

            if (tile.getLeft() == gameBoard.getTile(i).getRight())
            {
                System.out.println("The tile goes to the right of the board tile");
                return i+1;
                
              
                
            } 
            
            
            
            else if (tile.getRight() == gameBoard.getTile(i).getLeft())
            {
                System.out.println("The tile goes to the left of the board tile");
                
             
                    return i;
            }
            
            
          
            
            

        }
        System.out.println("The tile doesn't fit anywhere");
        return -1;
    }

    // Make a move from a hand. If a tile in the hand fits on the board
    // then remove it from the hand and place it in the board. The tile may
    // be rotated up to 3 times.  If no tile from the hand fits, then add
    // another tile to the hand  
    private void makeMove(Hand hand)
    {
        int rotationCounter = 0;

        // if (rotationCounter<3) 
        //  {
        for (int j = 0; j < hand.getSize(); j++)
        {
            
            int index=getIndexForFit(hand.get(j));
            System.out.println("The tile must be placed at index: "+index);
           
            if (index != -1)
            {
                
                System.out.println("The index is valid!");

                gameBoard.addTile(index, hand.get(j));
                hand.removeTile(j);

                break;
            }
            //else
            // {

            //   hand.get(j).rotate();
            //   rotationCounter++;
            //  }
        }

        //}
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

        finalString = "***** Player 1's Starting Hand *****\n" + p1Copy
                + "***** Player 2's Starting Hand *****\n" + p2Copy
                + "***** The Final Board *****\n" + gameBoard
                + "***** Player 1's Final Hand *****\n" + player1
                + "***** Player 2's Final Hand *****\n" + player2 +
                "\n" + victoryDecision;

        return finalString;
    }

} // end of TileGame class
