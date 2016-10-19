package gameBasics;

import java.util.*;

public class GameBasics {

   public static void main(String[] args) {

      Deck deck1 = new Deck(2);
      Deck deck2 = new Deck(2);
      Deck deck3 = new Deck();
      Deck deck4;
      Hand[] hands;
      
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
      
      int userInput = 0;
      Scanner keyboard = new Scanner(System.in);
      boolean test = false;
      
      while(!test){
         System.out.println("How many hands would you like to play? You can choose"
               + " between 1 - 10:");
         userInput = keyboard.nextInt();
         if(userInput < 1 || userInput > 10){
            System.out.println("I'm sorry, that is not a valid amount. Please try again.");
         }
         else{
            test = true;
            keyboard.close();
         }   
      }
      
      deck4 = new Deck();
      hands = new Hand[userInput];
      
      for(int i = 0; i < userInput; i++){
         Hand hand = new Hand();
         hands[i] = hand;
      }
      
      while(deck4.getTopCard() > 0){
         for(int k = 0; k < userInput; k++){
            if(deck4.getTopCard() > 0){
               hands[k].takeCard(deck4.dealCard());
            }
         }
      }
      for (int i = 0; i < userInput; i++){
         System.out.println("Hand: " + hands[i].toString());
         System.out.println();
      }
     
   }
}
