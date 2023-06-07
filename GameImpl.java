
public class GameImpl implements Game {

	@Override
	public Color getSpotColor(Position position) {
		return position.getSpot().getColor();
	}

	@Override
	public Piece getPiece(Position position) {
		// TODO Auto-generated method stub
		return position.getSpot().getPiece();
	}

	@Override
	public Card getTableCard() {
		
		Card tableCard = new Card(null, null, null);
		return tableCard;
	}

	@Override
	public Player getRedPlayer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player getBluePlayer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void makeMove(Piece piece, Card card, Position position)
			throws IncorrectTurnOrderException, IllegalMovementException, InvalidCardException, InvalidPieceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkVictory(Color color) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void printBoard() {
		// TODO Auto-generated method stub
		
	}
	


}
