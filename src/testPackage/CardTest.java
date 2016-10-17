package testPackage;
import static org.junit.Assert.*;
import org.junit.Test;

import gameBasics.Card;
import gameBasics.Card.Suit;

public class CardTest {
   Card test = new Card();
   
   @Test
   public void testSetCardValueFalse() {
      assertEquals(false, test.setCard('k', Suit.SPADES));
   }
   
   @Test
   public void testSetCardValueTrue() {
      assertEquals(true, test.setCard('p', Suit.SPADES));
   }

   @Test
   public void testtoStringFalse(){
      test.setCard('j', Suit.HEARTS);
      assertEquals("J of HEARTS", test.toString());
   }
   
   @Test
   public void testtoStringTrue(){
      test.setCard('M', Suit.HEARTS);
      assertEquals("This is an invalid card.", test.toString());
   }
   
   @Test
   public void testEqualsTrue(){
      Card testTrue = new Card('A', Suit.SPADES);
      assertEquals(true, equals(testTrue));
   }
}