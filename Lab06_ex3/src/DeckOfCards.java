import java.security.SecureRandom;
public class DeckOfCards {
   private Card[] deck;
   private  int currentCard;
   private static final int NUMBER_OF_CARDS=52;
   private static final SecureRandom randomNumbers=new SecureRandom();
   static int i = 0;
   
   String[] faces= {"Deuce","Three","Four","Five","Six", "Seven",
           "Eight","Nine","Ten","Jack","Queen","King", "Ace"};
     String[]suits= {"Hearts","Diamonds","Clubs","Spades"};
   
   public DeckOfCards() {
	      
	      
	      deck =new Card[NUMBER_OF_CARDS];
	      currentCard=0;
	      
	      for(int count=0; count<deck.length;count++)
	         deck[count]=new Card(faces[count%13], suits[count/13]);
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
   public Card dealCard() {
	      if(currentCard < deck.length)
	         return deck[currentCard++];
	      else
	         return null;
	   }
   public Card dealOneCard() {
	   return deck[i++];
   }
   
   public Card compare(Card a, Card b) {
	   int aFace = 0, bFace = 0, aSuit = 0, bSuit = 0;
	   for(int nFace = 0; nFace < faces.length; nFace++) {
		   if(a.getFace() == this.faces[nFace])
			   aFace = nFace;
		   if(b.getFace() == this.faces[nFace])
			   bFace = nFace;
	   }
	   
	   if (aFace > bFace) {
		   System.out.printf("Player A : ");
		   return a;
	   }
	   else if (aFace < bFace) {
		   System.out.printf("Player B : ");
		   return b;
	   }
	   else {
		   for(int nSuit = 0; nSuit < suits.length; nSuit++) {
			   if(a.getSuit() == this.suits[nSuit])
				   aSuit = nSuit;
			   if(b.getSuit() == this.suits[nSuit])
				   bSuit = nSuit;
		   }
		   if (aSuit > bSuit) {
			   System.out.printf("Player A : ");
			   return a;
		   }
		   else {
			   System.out.printf("Player B : ");
			   return b;
		   }
	   }
	  
   }
}
   
   
   
   