package mainData;

import java.util.ArrayList;
import java.util.List;

public class WhitePlayer implements Player {
    private List<Pawn> whitePawns = new ArrayList<>(8);
    private List<Bishop> whiteBishops = new ArrayList<>(2);
    private List<Knight> whiteKnights = new ArrayList<>(2);
    private List<Rook> whiteRooks = new ArrayList<>(2);
    private Queen whiteQueen = new Queen();
    private King whiteKing = new King();

    public WhitePlayer() {
        initialPosition();
        namingMyPiece();
    }

    public void namingMyPiece() {
        whitePawns.forEach(pawn -> pawn.setName(WhitePiece.WHITEPAWN));
        whiteBishops.forEach(bishop -> bishop.setName(WhitePiece.WHITEBISHOP));
        whiteKnights.forEach(knight -> knight.setName(WhitePiece.WHITEKNIGHT));
        whiteRooks.forEach(rook -> rook.setName(WhitePiece.WHITEROOK));
        whiteQueen.setName(WhitePiece.WHITEQUEEN);
        whiteKing.setName(WhitePiece.WHITEKING);
    }

    public List<Pawn> getWhitePawns() {
        return whitePawns;
    }

    public void setWhitePawns(List<Pawn> whitePawns) {
        this.whitePawns = whitePawns;
    }

    public List<Bishop> getWhiteBishops() {
        return whiteBishops;
    }

    public void setWhiteBishops(List<Bishop> whiteBishops) {
        this.whiteBishops = whiteBishops;
    }

    public List<Knight> getWhiteKnights() {
        return whiteKnights;
    }

    public void setWhiteKnights(List<Knight> whiteKnights) {
        this.whiteKnights = whiteKnights;
    }

    public List<Rook> getWhiteRooks() {
        return whiteRooks;
    }

    public void setWhiteRooks(List<Rook> whiteRooks) {
        this.whiteRooks = whiteRooks;
    }

    public void initialPosition() {
        whiteKing.setPosition("e1");
        whiteQueen.setPosition("d1");
        whiteKnights.add(new Knight());
        whiteKnights.add(new Knight());
        whiteKnights.get(0).setPosition("b1");
        whiteKnights.get(1).setPosition("g1");
        whiteBishops.add(new Bishop());
        whiteBishops.add(new Bishop());
        whiteBishops.get(0).setPosition("c1");
        whiteBishops.get(1).setPosition("f1");
        whiteRooks.add(new Rook());
        whiteRooks.add(new Rook());
        whiteRooks.get(0).setPosition("a1");
        whiteRooks.get(1).setPosition("h1");
        for (int i = 0; i < 8; i++) {
            whitePawns.add(new Pawn());
        }
        whitePawns.get(0).setPosition("a2");
        whitePawns.get(1).setPosition("b2");
        whitePawns.get(2).setPosition("c2");
        whitePawns.get(3).setPosition("d2");
        whitePawns.get(4).setPosition("e2");
        whitePawns.get(5).setPosition("f2");
        whitePawns.get(6).setPosition("g2");
        whitePawns.get(7).setPosition("h2");
    }


    public Queen getWhiteQueen() {
        return whiteQueen;
    }

    public void setWhiteQueen(Queen whiteQueen) {
        this.whiteQueen = whiteQueen;
    }

    public King getWhiteKing() {
        return whiteKing;
    }

    public void setWhiteKing(King whiteKing) {
        this.whiteKing = whiteKing;
    }
}
