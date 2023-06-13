import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * Classe que contém informações das cartas
 */
public class Card {
    /**
     * Construtor que define os principais atributos de uma cara
     * @param name Nome da carta
     * @param color Cor da carta
     * @param positions Todas as posições relativas de movimento
     */
	private String name;
	private Color color;
	private Position[] positions;
	private static Card TaNaMesa;
    

    public Card(String name, Color color, Position[] positions) {
		this.name = name;
		this.color = color;
		this.positions = positions;

	}

	

    public static Card isTaNaMesa() {
		return TaNaMesa;
	}



	public static void setTaNaMesa(Card taNaMesa) {
		TaNaMesa = taNaMesa;
	}



	public String getName() {
		return name;
	}



	public Color getColor() {
		return color;
	}



	public Position[] getPositions() {
		
		 
		
		return positions;
	}


	/**
     * Método que cria todas as cartas do jogo, embaralha-as e devolve as 5 que serão utilizadas na partida.
     * @return Vetor de cartas com todas as cartas do jogo
     */
	public static Card[] createCards() { 
		/* Gabigol = Tigre */
		Card gabigol = new Card("Gabigol", Color.BLUE, new Position[] { new Position(0, 1), new Position(0, -2) });

		/* Zico = Dragão */
		Card zico = new Card("Zico", Color.RED, new Position[] { new Position(-1, 1), new Position(1, 1), new Position(-2, -1), new Position(2, -1) });

		/* Arrascaeta = Sapo */
		Card arrascaeta = new Card("Arrascaeta", Color.RED, new Position[] { new Position(-1, -1), new Position(-2, 0), new Position(1, 1) });

		/* ViniciusJunior = Coelho */
		Card viniciusJunior = new Card("ViniciusJunior", Color.BLUE, new Position[] { new Position(1, 1), new Position(2, 0), new Position(-1, 1) });

		/* Pedro = Carangueijo */
		Card pedro = new Card("Pedro", Color.BLUE, new Position[] { new Position(0, -1), new Position(-2, 0), new Position(2, 0) });

		/* Adriano = Elefante */
		Card adriano = new Card("Adriano", Color.RED, new Position[] { new Position(-1, 0), new Position(-1, -1), new Position(1, 0), new Position(1, -1) });

		/* Everton Ribeiro = Ganso */
		Card evertonRibeiro = new Card("EvertonRibeiro", Color.BLUE, new Position[] { new Position(-1, 0), new Position(-1, -1), new Position(1, 0), new Position(1, 1) });

		/* Bruno Henrique = Galo */
		Card brunoHenrique = new Card("BrunoHenrique", Color.RED, new Position[] { new Position(-1, 0), new Position(-1, 1), new Position(1, 0), new Position(1, -1) });


        Card[] allCards = { arrascaeta, gabigol, brunoHenrique, viniciusJunior, adriano, pedro, evertonRibeiro, zico };

        List<Card> selectedCards = new ArrayList<>();
        Random random = new Random();

        while (selectedCards.size() < 5) {
            int randomIndex = random.nextInt(allCards.length);
            Card randomCard = allCards[randomIndex];
            if (!selectedCards.contains(randomCard)) {
                selectedCards.add(randomCard);
            }
        }

        return selectedCards.toArray(new Card[0]);
    }
	
    

}
