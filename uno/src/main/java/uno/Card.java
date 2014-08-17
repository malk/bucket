package uno;

public class Card {
	Color color;
	CardValue cardValue;

	private Card(CardValue cardValue, Color color) {
		this.color = color;
		this.cardValue = cardValue;
	}

	public static Card card(CardValue cardValue, Color color) {
		return new Card(cardValue, color);
	}
}
