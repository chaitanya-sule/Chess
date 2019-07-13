package java;

import java.util.regex.Pattern;

public class ChessBoard {
    private String[][] chessboard = new String[8][8];

    public String[][] getChessboard() {
        return chessboard;
    }

    public void setChessboard(String[][] chessboard) {
        this.chessboard = chessboard;
    }

    public Location getLocation(String loc) {
        Location location = new Location();
        Pattern pattern = Pattern.compile("[a-z]");
        String buffer = pattern.matcher(loc).group();
        int charValue = buffer.charAt(0) - 97;
        location.setHorizontal(charValue);
        pattern = Pattern.compile("[0-9]");
        buffer = pattern.matcher(loc).group();
        charValue = buffer.charAt(0) - 49;
        location.setVertical(charValue);
        return location;
    }

    public void placePiece(Location location, NamePiece name) {
            chessboard[location.getHorizontal()][location.getVertical()]=name.toString();
    }
}
