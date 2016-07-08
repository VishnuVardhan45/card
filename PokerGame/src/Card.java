
public class Card {
	private int suit;
	private int pip;
	public Card(int suit,int pip) {
		this.suit = suit;
		this.pip = pip;
	}
	public int getSuit() {
		return suit;
	}
	public int getPip() {
		return pip;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return suit+""+pip;
		
	}
}
