
public class GameImpl implements Game {
	private String nomeRed;
	private String nomeBlue;
	private Card[] cartas;
	private Deck deck;

	
	
	public GameImpl() {
		super();
	}

	
	public GameImpl(String nomeRed, String nomeBlue) {
		super();
		this.nomeRed = nomeRed;
		this.nomeBlue = nomeBlue;
	}

	

	public GameImpl(String nomeRed, String nomeBlue, Card[] deck) {
		super();
		this.nomeRed = nomeRed;
		this.nomeBlue = nomeBlue;
		this.cartas = deck;
		this.deck = new Deck(deck);
	}


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
		return Card.isTaNaMesa();
	}

	@Override
	public Player getRedPlayer() {
		Player vermei = new Player("vermei",Color.RED, deck.drawCards(2));
		return vermei;
	}

	@Override
	public Player getBluePlayer() {
		Player azul = new Player("vermei",Color.BLUE, deck.drawCards(2));
		return azul;
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
