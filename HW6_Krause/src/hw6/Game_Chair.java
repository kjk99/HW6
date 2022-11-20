package hw6;

import HW6.Game_Chair;
import HW6.Player;
import HW6.Shuffle;

public class Game_Chair {
	static Player Computer = new Player(true);
    static Player Player_2 = new Player(false);
    static Shuffle s = new Shuffle();

    public Player get_Computer() {
        return Computer;
    }

    public Player getPlayer_2() {
        return Player_2;
    }

    public static void main(String[] args) {

        Game_Chair chair = new Game_Chair();

        chair.get_Computer().setX(chair.get_Computer().Start());
        chair.getPlayer_2().setX(chair.getPlayer_2().Start());
        System.out.println(chair.getPlayer_2().getB().FindWinner(Player_2, Computer));


    }
}


}
