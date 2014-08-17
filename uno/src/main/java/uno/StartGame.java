package uno;

public class StartGame extends Command{
	int id;
	int playerCount;
	Card firstCard;

	public StartGame(int id, int players, Card card) {
		this.id = id;
		playerCount = players;
		firstCard = card;
	}
	public static Command startGame(int id, int players, Card card) {
		return 	(players < 3) ? null :
				(players > 5) ? null :
				new StartGame(id, players, card);
	}
	public int getId() {
		return id;
	}
	public int getPlayerCount() {
		return playerCount;
	}
	public Card getFirstCard() {
		return getFirstCard();
	}
}
