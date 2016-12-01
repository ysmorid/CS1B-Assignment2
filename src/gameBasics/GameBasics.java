package gameBasics;
import java.util.*;

public class GameBasics {

   public static void main(String[] args) {

      Deck deck;
      Hand[] hands;
      int userInput;
      
      System.out.println("------------------RUN 1----------------");
      System.out.println();
      
      deck = new Deck(2);
      display(deck);
      deck = new Deck(2);
      deck.shuffle();
      display(deck);
      
      
      deck = new Deck();
      display(deck);
      deck = new Deck();
      deck.shuffle();
      display(deck);
      
      System.out.println("------------------RUN 2----------------");
      System.out.println();
      
      userInput = getNumHands();
      deck = new Deck();
      hands = setNumHands(userInput);
      dealToHands(deck, hands, userInput);
      display(userInput, hands);
     
      System.out.println("Shuffle deck and re-deal cards:");
      deck = new Deck();
      deck.shuffle();
      resetHands(hands);
      dealToHands(deck, hands, userInput);
      display(userInput, hands);
   }
   
   public static int getNumHands(){
      int input = 0;
      Scanner keyboard = new Scanner(System.in);
      boolean test = false;
      
      while(!test){
         System.out.println("How many hands would you like to play? You can choose"
               + " between 1 - 10:");
         input = keyboard.nextInt();
         if(input < 1 || input > 10){
            System.out.println("I'm sorry, that is not a valid amount. Please try again.");
         }
         else{
            test = true;
            keyboard.close();
         }   
      }
      return input;
   }
   
   public static Hand[] setNumHands(int input){
      Hand[] hands = new Hand[input];
      
      for(int i = 0; i < input; i++){
         hands[i] = new Hand();
      }
      return hands;
   }
   
   public static void dealToHands(Deck deck, Hand[] hand, int input){
      while(deck.getTopCard() > 0){
         for(int k = 0; k < input; k++){
            if(deck.getTopCard() > 0){
               hand[k].takeCard(deck.dealCard());
            }
         }
      }
   }
   
   public static void resetHands(Hand[] hands){
      for(int i = 0; i < hands.length; i++){
         hands[i].resetHand();
      }
   }
   
   public static void display (Deck deck){
      for(int i = 0; i < deck.getTopCard(); i++){
         System.out.print(deck.dealCard().toString());
         if(i != deck.getTopCard() - 1){
            System.out.print(", ");            
         }
      }
      System.out.println();
      System.out.println();
   }
   
   public static void display(int input, Hand[] hand){
      for (int i = 0; i < input; i++){
         System.out.println("Hand: " + hand[i].toString());
         System.out.println();
      }
   }
   

}
