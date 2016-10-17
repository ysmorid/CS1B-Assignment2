package gameBasics;

public class Hand {

   public final int MAX_CARDS = 50;
   private Card[] myCards = new Card[MAX_CARDS];
   private int numCards;
   
   public Hand(){
      resetHand();
   }
   
   public void resetHand(){
      myCards = new Card[MAX_CARDS];
   }
 
   public boolean takeCard(Card card){
      if(numCards >= MAX_CARDS){
         return false;
      }
      myCards[numCards] = card;
      numCards++;
      return true;
   }
   
   public Card playCard(){
      numCards--;
      return myCards[numCards];
   }
   
   public String toString(){
      StringBuilder array = new StringBuilder();
      for(int i = 0; i < numCards; i++){
         array.append(myCards[i]);
         if(i != numCards-1){
         array.append(", ");
         }
      }
      return array.toString();
   }
   
   public int getNumCards(){
      return numCards;
   }
   
   public Card inspectCard(int k){
      if (k >= numCards){
         boolean error = true;
         Card card = new Card(error);
         return card;
      }
      return myCards[k];
   }
}
