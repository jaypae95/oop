import java.security.SecureRandom;

public class DeckOfCards {
	static int currentCard = 0;
	public static final int NUMBER_OF_CARDS = 52;
	private static final SecureRandom randomNumbers = new SecureRandom();
	static int i = 0;
	public static Card[] deck = new Card[NUMBER_OF_CARDS];;
	static String[] faces = { "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen",
			"King", "Ace" };
	static String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

	public static Card[] getDeck() {
		return deck;
	}

	public static void setDeck(Card[] deck) {
		for (int count = 0; count < deck.length; count++) {
			deck[count] = new Card(faces[count % 13], suits[count / 13]);
		}
	}

	public static void shuffle() {
		currentCard = 0;

		for (int first = 0; first < deck.length; first++) {
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}

	public static Card dealCard() {
		if (currentCard < deck.length) {
			return deck[currentCard++];
		} else
			return null;
	}

	public static Card dealOneCard() {
		return deck[i++];
	}

}
