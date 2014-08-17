package uno;

public class GameStartedEvent extends Event {
	int id;
	int playerCount;
	Card firstCard;
	public GameStartedEvent(int gameID, int playerCount, Card firstCard) {
		this.id = gameID;
		this.playerCount = playerCount;
		this.firstCard = firstCard;
	}
	
	public static Event gameStarted(int gameID, int playerCount, Card firstCard) {
		return new GameStartedEvent(gameID, playerCount, firstCard);
	}
}
