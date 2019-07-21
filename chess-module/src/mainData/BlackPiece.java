package mainData;

public enum BlackPiece implements NamePiece {
    BLACKPAWN("bp"),
    BLACKKNIGHT("bk"),
    BLACKQUEEN("bq"),
    BLACKROOK("br"),
    BLACKKING("bK"),
    BLACKBISHOP("bb");

    private String name;

    BlackPiece(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
