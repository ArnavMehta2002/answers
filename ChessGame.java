class Piece {
    private String name;
    private String color;

    public Piece(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public boolean canMove(int startX, int startY, int endX, int endY) {
        return true;
    }
}

class Board {
    private Piece[][] grid;

    public Board() {
        grid = new Piece[8][8];

    }

    public void placePiece(Piece piece, int x, int y) {
        grid[x][y] = piece;
    }

    public void movePiece(int startX, int startY, int endX, int endY) {
        Piece piece = grid[startX][startY];
        if (piece != null && piece.canMove(startX, startY, endX, endY)) {
            grid[endX][endY] = piece;
            grid[startX][startY] = null;
        } else {
            System.out.println("Invalid move!");
        }
    }
}

class Player {
    private String name;
    private String color;

    public Player(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void makeMove(Board board, int startX, int startY, int endX, int endY) {
        board.movePiece(startX, startY, endX, endY);
    }
}

public class ChessGame {
    public static void main(String[] args) {
        Player player1 = new Player("Alice", "White");
        Player player2 = new Player("Bob", "Black");

        Board board = new Board();

        player1.makeMove(board, 1, 0, 2, 0);

        player2.makeMove(board, 6, 0, 4, 0);
    }
}
