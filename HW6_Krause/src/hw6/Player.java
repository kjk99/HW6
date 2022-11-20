package hw6;

import java.util.Scanner;


public class Player {
	 private int x;
	    private BetMore_Game b = new BetMore_Game();
	    private boolean user_selected;

	    public Player(boolean b) {
	        this.user_selected = b;
	    }

	    public int Start() {
	        int i = 0;
	        if (user_selected == false) {
	            while(i < 5 && user_selected == false) {
	            int temp = b.Play();
	            System.out.println("Player_2, your card is: " + temp);
	            Scanner sc = new Scanner(System.in);
	            System.out.println("Do you want to draw another card? (y/n)");
	            String bet = sc.next();
	            if (bet.equals("y")) {
	                i++;
	            } else if (bet.equals("n")) {
	                sc.close();
	                i = 6;
	                this.user_selected = true;
	                return temp;
	             }
	            }
	        } else {
	            return b.Play();
	        }
	        return i;
	    }
	    
	    public void setX(int x) {
	        this.x = x;
	    }

	    public int getX() {
	        return x;
	   }

	   public void setUser_selected(boolean user_selected) {
	       this.user_selected = user_selected;
	   }
	   
	   public BetMore_Game getB() {
	       return b;
	   }
	}

