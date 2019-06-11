package java;

public class WhitePlayer {
    private Pawn[] whitePawns = new Pawn[7];
    private Bishop[] whiteBishops = new Bishop[1];
    private Knight[] whiteKnights = new Knight[1];
    private Rook[] whiteRooks = new Rook[1];
    private Queen whiteQueen;
    private King whiteKing;

    public Rook[] getWhiteRooks() {
        return whiteRooks;
    }

    public void setWhiteRooks(Rook[] whiteRooks) {
        this.whiteRooks = whiteRooks;
    }

    public void initialPosition() {
        whiteKing.setPosition("e1");
        whiteQueen.setPosition("d1");
        whiteKnights[0].setPosition("b1");
        whiteKnights[1].setPosition("g1");
        whiteBishops[0].setPosition("c1");
        whiteBishops[1].setPosition("f1");
        whiteRooks[0].setPosition("a1");
        whiteRooks[1].setPosition("h1");
        whitePawns[0].setPosition("a2");
        whitePawns[1].setPosition("b2");
        whitePawns[2].setPosition("c3");
        whitePawns[3].setPosition("d3");
        whitePawns[4].setPosition("e3");
        whitePawns[5].setPosition("f3");
        whitePawns[6].setPosition("g3");
        whitePawns[7].setPosition("h3");
    }

    public Pawn[] getWhitePawns() {
        return whitePawns;
    }

    public void setWhitePawns(Pawn[] whitePawns) {
        this.whitePawns = whitePawns;
    }

    public Bishop[] getWhiteBishops() {
        return whiteBishops;
    }

    public void setWhiteBishops(Bishop[] whiteBishops) {
        this.whiteBishops = whiteBishops;
    }

    public Knight[] getWhiteKnights() {
        return whiteKnights;
    }

    public void setWhiteKnights(Knight[] whiteKnights) {
        this.whiteKnights = whiteKnights;
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
