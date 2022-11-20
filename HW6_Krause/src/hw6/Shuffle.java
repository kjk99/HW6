package hw6;

public class Shuffle {
	  public int pick_card() {
          int r = (int) (Math.random() * (100 - 1)) + 1;
          return r;
      }
}
