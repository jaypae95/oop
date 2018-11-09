public class DeckOfCardsTest {
   
   public static void main(String [] args) {
	   
      DeckOfCards myDeckOfCards = new DeckOfCards();
      myDeckOfCards.shuffle();

      
//      for(int i = 1; i<=52;i++) {
//         System.out.printf("%-19s",myDeckOfCards.dealCard());
//         
//         if(i%4==0)
//            System.out.println();
//      }
      
      
      Card playerA = myDeckOfCards.dealOneCard();
      Card playerB = myDeckOfCards.dealOneCard();
      
      System.out.println("Player A : " + playerA);
      System.out.println("Player B : " + playerB);
      
      System.out.println();
      
      
      System.out.println("Winner is : " + myDeckOfCards.compare(playerA, playerB));
      
   }
}