package gameBasics;

public class GameBasics {

   public static void main(String[] args) {

      //Test Card Class
      Card card1 = new Card();
      Card card2 = new Card('p', Card.Suit.DIAMONDS);
      Card card3 = new Card('j', Card.Suit.CLUBS);
      
      System.out.println(card1.toString());
      System.out.println(card2.toString());
      System.out.println(card3.toString());
      System.out.println("");
      
      card1.setCard('1', Card.Suit.HEARTS);
      card2.setCard('Q', Card.Suit.SPADES);
      
      System.out.println(card1.toString());
      System.out.println(card2.toString());
      System.out.println(card3.toString());
      System.out.println("");

      //Test Hand Class
      Hand hand1 = new Hand();
      Card card4 = new Card();
      
      while(hand1.takeCard(card2) && hand1.takeCard(card3) && hand1.takeCard(card4) ){
      }
      
      System.out.println("Hand: " + hand1.toString()); 
      System.out.println("");
      
      //Testing Inspect Card
      System.out.println("The card in position 5 is " + hand1.inspectCard(5).toString());
      System.out.println("The card in position 55 is " + hand1.inspectCard(55).toString());
      System.out.println("");
      
      //Playing the Hand
      System.out.println("Playing the Hand:");
      for(int i = hand1.getNumCards()-1; i >= 0; i--){
         if(i == 0){
            System.out.println("Playing " + hand1.playCard().toString());
            hand1.resetHand();
            System.out.println("");
            System.out.println("Hand Empty");
            System.out.println("Hand: (" + hand1.toString() + " )"); 
         }
         else{
            System.out.println("Playing " + hand1.playCard().toString());
         }
      }
   }

}
