/*
 * Test class for tile game
 */

import javax.swing.JOptionPane ;

/**
 * @author Octavio Avila-Cardet
 */
public class TileTest {
    public static void main (String args [])
    {
       System.out.println("**************************");
       System.out.println("*LET THE TILE GAMES BEGIN*");
       System.out.println("**************************");

       String input;
       do{
        System.out.println("");
        System.out.println("STARTING NEW GAME");
        System.out.println("-----------------");
        
        TileGame startGame = new TileGame ();
        startGame.play();
        System.out.println(startGame);
       
        input = JOptionPane.showInputDialog("Would you like to see another game?"
                + "\nType \"y\" or \"n\"") ;
        
        while (!(input.toLowerCase().equals("y")||input.toLowerCase().equals("n")))
        {
            input = JOptionPane.showInputDialog("Please enter a valid input\n"
                    + "\nWould you like to see another game?"
                    + "\nType \"y\" or \"n\"") ;
        }
        
       }while(input.toLowerCase().equals("y"));
       
        System.out.println("**********************");
        System.out.println("*THE GAMES HAVE ENDED*");
        System.out.println("**********************");
    }
}
