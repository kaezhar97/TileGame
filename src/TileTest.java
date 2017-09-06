/*
 * Test class for tile game
 */

/**
 *
 * @author Octavio Avila-Cardet
 */
public class TileTest {
    public static void main (String args [])
    {
       
        
       
       Hand newHand=new Hand();
       System.out.println(newHand);
       
       
       
       Hand duplicate=new Hand(newHand);
       System.out.println(duplicate);
    }
}
