package mainData;

public class ChessBoard {
    private String[][] chessboard = new String[8][8];

    public String[][] getChessboard() {
        return chessboard;
    }

    public Location getLocation(String loc) {
        Location location = new Location();
        if (loc.matches("[a-z][0-9]")) {
            int charValue = loc.charAt(0) - 97;
            location.setHorizontal(charValue);
            charValue = loc.charAt(1) - 49;
            location.setVertical(charValue);
            return location;
        }
//        return location;
        throw new RuntimeException("invalid location");
    }

    public void placePiece(Location location, NamePiece name) {
//        System.out.println("location"+location.getHorizontal()+"vert:"+location.getVertical()+"name:"+name);
        chessboard[location.getHorizontal()][location.getVertical()] = name.toString();
    }

    public void print() {
        System.out.println();
        System.out.println("###########################");
        for (int i = 0; i <= 7; i++) {
            System.out.print("#|"); //all rows begin with a divider
            for (int j = 0; j <= 7; j++) {
                if (this.chessboard[i][j] == null) { //if empty square
                    System.out.print("  "); //print empty string
                    System.out.print("|"); //print divider
                } else {
                    System.out.print(this.chessboard[i][j]); //print acronym
                    System.out.print("|"); //print divider
                }
            }
            System.out.println("#"); //next row
            if (i != 7) {
                System.out.println("#|-----------------------|#"); //line break between rows
            }
        }
        System.out.println("###########################");
        System.out.println();
    }

}
