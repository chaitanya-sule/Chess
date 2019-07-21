package mainData;

import java.util.ArrayList;
import java.util.List;

public class BlackPlayer implements Player {
    private List<Pawn> blackPawns = new ArrayList<>();
    private List<Bishop> blackBishops = new ArrayList<>();
    private List<Knight> blackKnights = new ArrayList<>();
    private List<Rook> blackRooks = new ArrayList<>();
    private Queen blackQueen = new Queen();
    private King blackKing = new King();

    public BlackPlayer() {
        initialPosition();
        namingMyPiece();
    }

    public void initialPosition() {
        blackKing.setPosition("e8");
        blackQueen.setPosition("d8");
        blackKnights.add(new Knight());
        blackKnights.add(new Knight());
        blackKnights.get(0).setPosition("b8");
        blackKnights.get(1).setPosition("g8");
        blackBishops.add(new Bishop());
        blackBishops.add(new Bishop());
        blackBishops.get(0).setPosition("c8");
        blackBishops.get(1).setPosition("f8");
        blackRooks.add(new Rook());
        blackRooks.add(new Rook());
        blackRooks.get(0).setPosition("a8");
        blackRooks.get(1).setPosition("h8");
        for (int i = 0; i < 8; i++) {
            blackPawns.add(new Pawn());
        }
        blackPawns.get(0).setPosition("a7");
        blackPawns.get(1).setPosition("b7");
        blackPawns.get(2).setPosition("c7");
        blackPawns.get(3).setPosition("d7");
        blackPawns.get(4).setPosition("e7");
        blackPawns.get(5).setPosition("f7");
        blackPawns.get(6).setPosition("g7");
        blackPawns.get(7).setPosition("h7");
    }

    public void namingMyPiece() {
        blackPawns.forEach(pawn -> pawn.setName(BlackPiece.BLACKPAWN));
        blackBishops.forEach(bishop -> bishop.setName(BlackPiece.BLACKBISHOP));
        blackKnights.forEach(knight -> knight.setName(BlackPiece.BLACKKNIGHT));
        blackRooks.forEach(rook -> rook.setName(BlackPiece.BLACKROOK));
        blackQueen.setName(BlackPiece.BLACKQUEEN);
        blackKing.setName(BlackPiece.BLACKKING);
    }

    public List<Pawn> getBlackPawns() {
        return blackPawns;
    }

    public void setBlackPawns(List<Pawn> blackPawns) {
        this.blackPawns = blackPawns;
    }

    public List<Bishop> getBlackBishops() {
        return blackBishops;
    }

    public void setBlackBishops(List<Bishop> blackBishops) {
        this.blackBishops = blackBishops;
    }

    public List<Knight> getBlackKnights() {
        return blackKnights;
    }

    public void setBlackKnights(List<Knight> blackKnights) {
        this.blackKnights = blackKnights;
    }

    public List<Rook> getBlackRooks() {
        return blackRooks;
    }

    public void setBlackRooks(List<Rook> blackRooks) {
        this.blackRooks = blackRooks;
    }

    public Queen getBlackQueen() {
        return blackQueen;
    }

    public void setBlackQueen(Queen blackQueen) {
        this.blackQueen = blackQueen;
    }

    public King getBlackKing() {
        return blackKing;
    }

    public void setBlackKing(King blackKing) {
        this.blackKing = blackKing;
    }
}
