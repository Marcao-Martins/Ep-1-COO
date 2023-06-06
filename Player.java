/**
 * Classe que contém informações e ações básicas relacionadas aos jogadores
 */
public class Player {
    /**
     * Construtor que define informações básicas do jogador
     * @param name Nome do jogador
     * @param pieceColor Cor das peças do jogador
     * @param cards Cartas na mão do jogador
     */
	private String name;
	private Color pieceColor;
	private Card[] cards;
	
    public Player(String name, Color pieceColor, Card[] cards) {
    	this.name = name;
    	this.pieceColor = pieceColor;
    	this.cards = cards;
    }

    /**
     * Método que devolve o nome do jogador(a)
     * @return String com o nome do jogador(a)
     */
    public String getName() {
        return name;
    }

    /**
     * Método que devolve a cor das peças do jogador
     * @return Enum Color com a cor das peças do jogador
     */
    public Color getPieceColor() {
        return pieceColor;
    }

    /**
     * Método que devolve as cartas da mão do jogador
     * @return Booleano true para caso seja um mestre e false caso contrário
     */
    public Card[] getCards() {
        return cards;
    }
    
    
    /** Metodo pra saber se a carta ta na Mao do jogador*/
    
    private boolean verificaMao(Card oldCard) {
    	Card[] playerCards = getCards(); 
	    boolean taNaMao = false;
	    for (Card card : playerCards) {
	        if (card.equals(oldCard)) {
	        	taNaMao = true;
	            break;
	        }
	    }

    	return taNaMao;
    }

    /**
     * Método que troca uma carta da mão por outra carta (idealmente da mesa)
     * @param oldCard A carta que será substituída
     * @param newCard A carta que irá substituir
     * @exception InvalidCardException Caso a carta não esteja na mão do jogador e/ou na mesa
     */
    protected void swapCard(Card oldCard, Card newCard) throws Exception {
        try {
            if (!verificaMao(oldCard)) {
                throw new InvalidCardException("Carta não está na mão do jogador");
            } else if (!newCard.verificaMesa()) {
                throw new InvalidCardException("Carta não está na mesa");
            } else if (!newCard.verificaMesa() && !verificaMao(oldCard)) {
                throw new InvalidCardException("A carta da Mesa e da Mão estão erradas");
            } else {
                oldCard = newCard;
            }
        } catch (InvalidCardException e) {
            e.printStackTrace();
        }
    }


    }
