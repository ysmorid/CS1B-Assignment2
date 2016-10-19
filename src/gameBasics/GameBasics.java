package gameBasics;

import java.util.*;

public class GameBasics {

   public static void main(String[] args) {

      Deck deck1 = new Deck(2);
      Deck deck2 = new Deck(2);
      Deck deck3 = new Deck();
      Deck deck4;
      Hand[] hands;
      int userInput;
      
      System.out.println("------------------RUN 1----------------");
      System.out.println();
      
      deck1.display();
      System.out.println();
      
      deck2.shuffle();
      deck2.display();
      System.out.println();
      
      deck3.display();
      System.out.println();
      
      deck3.shuffle();
      deck3.display();
      
      System.out.println("------------------RUN 2----------------");
      System.out.println();
      
      userInput = getNumHands();
      deck4 = new Deck();
      hands = new Hand[userInput];
      
      for(int i = 0; i < userInput; i++){
         Hand hand = new Hand();
         hands[i] = hand;
      }
      
      dealToHands(deck4, hands, userInput);
      display(userInput, hands);
     
      for(int i = 0; i < userInput; i++){
         hands[i].resetHand();
      }
      
      deck4 = new Deck();
      deck4.shuffle();
      
      dealToHands(deck4, hands, userInput);
      display(userInput, hands);
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
   
   public static void display(int input, Hand[] hand){
      for (int i = 0; i < input; i++){
         System.out.println("Hand: " + hand[i].toString());
         System.out.println();
      }
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
}
