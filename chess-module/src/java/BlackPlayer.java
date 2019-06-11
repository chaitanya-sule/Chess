package java;

public class BlackPlayer {
    private Pawn[] blackPawns = new Pawn[7];
    private Bishop[] blackBishops = new Bishop[1];
    private Knight[] blackKnights = new Knight[1];
    private Rook[] blackRooks = new Rook[1];
    private Queen blackQueen;
    private King blackKing;

    public void initialPosition() {
        blackKing.setPosition("e1");
        blackQueen.setPosition("d1");
        blackKnights[0].setPosition("b1");
        blackKnights[1].setPosition("g1");
        blackBishops[0].setPosition("c1");
        blackBishops[1].setPosition("f1");
        blackRooks[0].setPosition("a1");
        blackRooks[1].setPosition("h1");
        blackPawns[0].setPosition("a2");
        blackPawns[1].setPosition("b2");
        blackPawns[2].setPosition("c3");
        blackPawns[3].setPosition("d3");
        blackPawns[4].setPosition("e3");
        blackPawns[5].setPosition("f3");
        blackPawns[6].setPosition("g3");
        blackPawns[7].setPosition("h3");
    }

    public Pawn[] getBlackPawns() {
        return blackPawns;
    }

    public void setBlackPawns(Pawn[] blackPawns) {
        this.blackPawns = blackPawns;
    }

    public Bishop[] getBlackBishops() {
        return blackBishops;
    }

    public void setBlackBishops(Bishop[] blackBishops) {
        this.blackBishops = blackBishops;
    }

    public Knight[] getBlackKnights() {
        return blackKnights;
    }

    public void setBlackKnights(Knight[] blackKnights) {
        this.blackKnights = blackKnights;
    }

    public Rook[] getBlackRooks() {
        return blackRooks;
    }

    public void setBlackRooks(Rook[] blackRooks) {
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
