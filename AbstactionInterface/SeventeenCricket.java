package AbstactionInterface;

public class SeventeenCricket implements SeventeenGame {

	@Override
	public void playerQuantity() {
		System.out.println("In the cricket 11 players are playing the game");
	}

	@Override
	public void playerTypes() {
		System.out.println("Batsman, Bowler, Wicket Creeper etc");
	}
}
