package java;


import java.util.Arrays;

public class ChessFactory {
    public static void main(String[] args) {
        WhitePlayer whitePlayer = new WhitePlayer();
        BlackPlayer blackPlayer = new BlackPlayer();

        printChessBoard(whitePlayer,blackPlayer);
    }

    private static void printChessBoard(WhitePlayer whitePlayer, BlackPlayer blackPlayer) {
        ChessBoard chessBoard = new ChessBoard();
        placePlayerPiece(whitePlayer,blackPlayer, chessBoard);

    }

    private static void placePlayerPiece(WhitePlayer whitePlayer, BlackPlayer blackPlayer, ChessBoard chessBoard) {
        placeWhitePlayer(whitePlayer, chessBoard);
        placeBlackPlayer(blackPlayer, chessBoard);
    }

    private static void placeBlackPlayer(BlackPlayer blackPlayer, ChessBoard chessBoard) {
        blackPlayer.getBlackKing().placePiece(chessBoard);
        blackPlayer.getBlackQueen().placePiece(chessBoard);
        placeArrayOfPiece(blackPlayer.getBlackRooks(), chessBoard);
        placeArrayOfPiece(blackPlayer.getBlackBishops(),chessBoard);
        placeArrayOfPiece(blackPlayer.getBlackKnights(), chessBoard);
        placeArrayOfPiece(blackPlayer.getBlackPawns(), chessBoard);
    }

    private static void placeWhitePlayer(WhitePlayer whitePlayer, ChessBoard chessBoard) {
        whitePlayer.getWhiteQueen().placePiece(chessBoard);
        whitePlayer.getWhiteKing().placePiece(chessBoard);
        placeArrayOfPiece(whitePlayer.getWhiteRooks(), chessBoard);
        placeArrayOfPiece(whitePlayer.getWhiteBishops(),chessBoard);
        placeArrayOfPiece(whitePlayer.getWhiteKnights(), chessBoard);
        placeArrayOfPiece(whitePlayer.getWhitePawns(), chessBoard);
    }

    private static void placeArrayOfPiece(Piece[] pieces, ChessBoard chessBoard) {
        Arrays.stream(pieces).forEach(piece -> piece.placePiece(chessBoard));
    }
}
