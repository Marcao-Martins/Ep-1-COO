public class Position {
    private int row;
    private int col;

    public Position(int row, int col) throws OnitamaGameException {
        if (row > 4 || col > 4) {
            throw new OnitamaGameException("Posição inválida. Os números de linha e coluna devem estar entre 0 e 4.");
        }
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
