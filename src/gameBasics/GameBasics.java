package gameBasics;

import java.util.*;

public class GameBasics {

   public static void main(String[] args) {

      Deck deck1 = new Deck(2);
      Deck deck2 = new Deck(2);
      Deck deck3 = new Deck();
      Deck deck4;
      Hand hands;
      
      int userInput = 0;
      
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
   }
}
