package gameBasics;

public class Deck {
   public final int MAX_CARDS = 312;
   private static Card[] masterPack = new Card[52];
   private Card[] cards;
   private int topCard;
   private int numPacks;

   Deck(){ 
      
       }
   
   Deck(int numPacks){
      
   }
   
   private static void allocateMasterPack(){
      for(int i = 0; i <= masterPack.length - 1; i++){
         //loop create cards with enum type, switch to next enum when full
            //innner loop to create cards 2-k within enum type
      }
   }
}
