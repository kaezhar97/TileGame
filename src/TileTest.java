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
       for (int i=0;i<newHand.getSize();i++)
       {
        System.out.println(newHand.get(i));
       }
       
       Hand duplicateHand=new Hand(newHand);
       
      System.out.println("\n *****Duplicate hand*****");
      
      /**
       
      for (int i=0;i<duplicateHand.getSize();i++)
       {
        System.out.println(duplicateHand.get(i));
       }
   
       */
      
    }
}
