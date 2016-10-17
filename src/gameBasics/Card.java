package gameBasics;

public class Card {
   
   public enum Suit {HEARTS, SPADES, CLUBS, DIAMONDS};
   private Suit suit;
   private char value;
   private boolean errorFlag;
  
   public Card(){
      this('A', Suit.SPADES);
   }
   
   public Card(char value, Suit suit){
     setCard(value, suit);
   }
   
   public Card(Card card){
      this(card.getValue(), card.getSuit());
   }
   
   public Card(boolean errorCheck){
      this('A', Suit.SPADES);
      errorFlag = errorCheck;
   }
     
   public boolean setCard(char value, Suit suit)
   {
      this.suit = suit;
      char upValue = Character.toUpperCase(value);
      
      if(isValid(upValue, suit)){
         this.value = upValue;
         errorFlag = false;
      }
      else{
         this.value = 'A';
         errorFlag = true;
      }
      return errorFlag;
   }
   
   public boolean isValid(char value, Suit suit){
      if (value == 'A' || value == 'K' || value == 'Q' || value == 'J'
            || value == 'T' || (value >= '2' && value <= '9'))
         return true;
      else
      {
         return false;
      }
   }
   
   public String toString()
   {
      String returnValue;
      if (errorFlag){
         returnValue = "Invalid Card"; 
      }
      else{
         returnValue = String.valueOf(value) + " of " + suit;
      }
      return returnValue;
   }
   
   public char getValue(){
      return value;
   }
   
   public Suit getSuit(){
      return suit;
   }
   
   public boolean checkError(){
      return errorFlag;
   }
   
   public boolean equals(Card card){
      boolean identical = false;
      
      if(this.value == card.value &&
      this.suit == card.suit){
         identical = true;
      }
      return identical;
   }
}
