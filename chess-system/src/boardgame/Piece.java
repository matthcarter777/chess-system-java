package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}

	protected void setBoard(Board board) {
		this.board = board;
	}
	
	
	
	
}
