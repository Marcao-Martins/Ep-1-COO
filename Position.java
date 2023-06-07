public class Position {
    private int row;
    private int col;
    private Spot[][] tabuleiro;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
        this.tabuleiro = new Spot[4][4];
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public Spot getSpot() {
        return tabuleiro[row][col];
    }

    public void setSpot(Spot spot) {
        tabuleiro[row][col] = spot;
    }
    public Position Move(Position ini,Position movimento) throws IllegalMovementException {
    	Position result = new Position(ini.getRow()+movimento.getRow(),ini.getCol()+ini.getCol());
    	if (result.getRow() > 4 || result.getCol() > 4||result.getRow()<0||result.getCol()<0) {
            throw new IllegalMovementException("Posição resultante inválida.");
        }
		return result;
    }
}
