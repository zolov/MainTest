package some;

/**
 * ChessBoard.
 *
 * @author Igor_Zolov
 */
public class ChessBoard {
    // Class
    private static ChessBoard board = new ChessBoard("Singleton");

    // Object
    private String name;


    public ChessBoard(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ChessBoard staticEnc = ChessBoard.board;
        ChessBoard ebony = new ChessBoard("Ebony");
        ChessBoard black = new ChessBoard("Black");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


