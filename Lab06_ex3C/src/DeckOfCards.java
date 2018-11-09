import java.security.SecureRandom;
public class DeckOfCards {
   private Card[] deck;
   private  int currentCard;
   private static final int NUMBER_OF_CARDS=52;
   private static final SecureRandom randomNumbers=new SecureRandom();
   static int i = 0;
   public enum faces {Deuce,Three,Four,Five,Six, Seven,
           Eight,Nine,Ten,Jack,Queen,King, Ace};
   public enum suits {Clubs, Hearts, Diamonds,Spades};
   
   public DeckOfCards() {
	      
	      
	      deck =new Card[NUMBER_OF_CARDS];
	      currentCard=0;
	      
	      for(int count=0; count<deck.length;count++)
	         deck[count]=new Card(count%13, count/13);
	   }
   public void shuffle() {
	      currentCard=0;
	      
	      for(int first=0;first < deck.length;first++) {
	         int second=randomNumbers.nextInt(NUMBER_OF_CARDS);
	         
	         Card temp=deck[first];
	         deck[first]=deck[second];
	         deck[second]=temp;
	      }
   }
   
   public String numToString(Card curDeck) {
	   faces Face = null;
	   suits Suit = null;
	   
	   switch(curDeck.getFace()){
	   case 0 : 
		   Face = faces.Deuce;
		   break;
	   case 1 :
		   Face = faces.Three;
		   break;
	   case 2 :
		   Face = faces.Four;
		   break;
	   case 3 :
		   Face = faces.Five;
		   break;
	   case 4 :
		   Face = faces.Six;
		   break;
	   case 5 :
		   Face = faces.Seven;
		   break;
	   case 6 :
		   Face = faces.Eight;
		   break;
	   case 7 :
		   Face = faces.Nine;
		   break;
	   case 8 :
		   Face = faces.Ten;
		   break;
	   case 9 :
		   Face = faces.Jack;
		   break;
	   case 10 :
		   Face = faces.Queen;
		   break;
	   case 11 : 
		   Face = faces.King;
		   break;
	   case 12 :
		   Face =faces.Ace;
		   break;
	   }
	   switch(curDeck.getSuit()){
	   
	   case 0 : 
		   Suit = suits.Clubs;
		   break;
	   case 1 : 
		   Suit = suits.Hearts;
		   break;
	   case 2 : 
		   Suit = suits.Diamonds;
		   break;
	   case 3 : 
		   Suit = suits.Spades;
		   break;
		   }
	   return Face + " of " + Suit;
   }
   public String dealCard() {
	   
	   if(currentCard < deck.length) {
		   return numToString(deck[currentCard++]);	      
	    	  }
	      else
	    	  return null;
	   }

   
}
   
   
   
   