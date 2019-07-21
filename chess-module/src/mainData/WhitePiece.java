package mainData;

public enum WhitePiece implements NamePiece {
    WHITEPAWN("wp"),
    WHITEROOK("wr"),
    WHITEKNIGHT("wk"),
    WHITEBISHOP("wb"),
    WHITEKING("wK"),
    WHITEQUEEN("wq");
    private String name;

    WhitePiece(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
