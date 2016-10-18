package gameBasics;

import gameBasics.Card.Suit;

public class Deck {
   public final int MAX_CARDS = 312;
   private static Card[] masterPack = new Card[52];
   private Card[] cards;
   private int topCard;
   private int numPacks;

   Deck(){ 
      allocateMasterPack();
       }
   
   Deck(int numPacks){
      
   }
   
   private static void allocateMasterPack(){
      char value;
      Suit suit;
      
      for(int i = 0; i <= masterPack.length - 1; i++){
         masterPack[i] = new Card();
      }  
      
      for(int j = 0; j < 4; j++){
         switch(j){
         case 0:
            suit = Card.Suit.CLUBS;
            break;
         case 1:
            suit = Card.Suit.DIAMONDS;
            break;
         case 2:
            suit = Card.Suit.HEARTS;
            break;
         case 3:
            suit = Card.Suit.SPADES;
            break;
         default:
            suit = Card.Suit.SPADES;
           break;
         }
         
         masterPack[13*j].setCard('A', suit);
         int k = 1;
         for(value = '2'; value >= '2' && value <= '9'; value++){
            masterPack[13*j + k].setCard(value, suit);
            k++;
         }
         masterPack[13*j+9].setCard('T', suit);
         masterPack[13*j+10].setCard('J', suit);
         masterPack[13*j+11].setCard('Q', suit);
         masterPack[13*j+12].setCard('K', suit);
      }
   }
   
   public void display(){
      for (int i = 0; i < masterPack.length; i++){
         System.out.println(masterPack[i].toString());
      }
   }
   
}
