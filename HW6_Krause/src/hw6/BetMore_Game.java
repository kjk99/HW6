package hw6;

public class BetMore_Game {

	    private Shuffle s = new Shuffle();

	    public int Play() {
	        return s.pick_card();
	    }

	    

	    public String FindWinner(Player p1, Player p2) {
	        if (p1.getX() > p2.getX()) {
	            return "The Winner is Computer";
	        } else {
	            return "The Winner is Player_2";
	        }
	    }
	}
