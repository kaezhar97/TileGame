/*
 * Test class for tile game
 */

import javax.swing.JOptionPane ;

/**
 *
 * @author Octavio Avila-Cardet
 */
public class TileTest {
    public static void main (String args [])
    {
       String input;
       do{
        TileGame startGame = new TileGame ();
        startGame.play();
        System.out.println(startGame);
       
        input = JOptionPane.showInputDialog("Would you like to see another game?\nType \"y\" or \"n\"") ;
        
        while (!(input.toLowerCase().equals("y")||input.toLowerCase().equals("n")))
        {
            input = JOptionPane.showInputDialog("Please enter a valid input\n\nWould you like to see another game?\nType \"y\" or \"n\"") ;
        }
        
       }while(input.toLowerCase().equals("y"));
    }
}
