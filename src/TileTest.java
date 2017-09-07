/*
 * Test class for tile game
 */

import TileGameClasses.TileGame;
import javax.swing.JOptionPane ;

/**
 * The main class for the tile game.
 * It plays a tile game. Then, asks the user if he or she wants to see another one.
 * 
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
        
        TileGame startGame = new TileGame (); //Starts a new tile game
        startGame.play(); // Plays the game
        System.out.println(startGame); //Prints out the result of the game
       
        input = JOptionPane.showInputDialog("Would you like to see another game?" //Ask the user if they want to see another game
                + "\nType \"y\" or \"n\"") ;
        
        //Ensures that the user is inputting valid answers
        while (!(input.toLowerCase().equals("y")||input.toLowerCase().equals("n")))
        {
            input = JOptionPane.showInputDialog("Please enter a valid input\n"
                    + "\nWould you like to see another game?"
                    + "\nType \"y\" or \"n\"") ;
        }
        
       }while(input.toLowerCase().equals("y")); //Keeps playing new games for as long as the user keeps answering "y" to the prompt
       
        System.out.println("\n**********************");
        System.out.println("*THE GAMES HAVE ENDED*");
        System.out.println("**********************");
    }
}
