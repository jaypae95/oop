public class DeckOfCardsTest {

	public static void main(String[] args) {
		DeckOfCards.setDeck(DeckOfCards.deck);
		DeckOfCards.shuffle();
		DeckOfCards.currentCard = 0;
		for (int i = 1; i <= 52; i++) {
			System.out.printf("%-19s", DeckOfCards.dealCard());

			if (i % 4 == 0)
				System.out.println();

		}

	}
}