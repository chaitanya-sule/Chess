package java;

public abstract class Piece {
   private String position;
   private Boolean dead = false;

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
}
