package java;

public abstract class Piece {
   private String position;
   private Boolean dead = false;
   private NamePiece name;


   public String getPosition() {
      return position;
   }

   public void setPosition(String position) {
      this.position = position;
   }

   public Boolean getDead() {
      return dead;
   }

   public void setDead(Boolean dead) {
      this.dead = dead;
   }

   abstract void performMove();

   public void placePiece(ChessBoard chessBoard) {
      if (this.dead) {
         Location location = chessBoard.getLocation(position);
         chessBoard.placePiece(location, this.getName());
      }
   }

   public NamePiece getName() {
      return name;
   }

   public void setName(NamePiece name) {
      this.name = name;
   }
}
