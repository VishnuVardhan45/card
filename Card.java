public class Card {
	public void card(int pip,int suit) {
		this.pip = pip;
		this.suit = suit;			
	}
	public void getSuit() {
		String suits [] = {"c","d","h","s"};
		for(int i = 0 ; i < 4 ; i++) {
			if(suits[i] == suit) {
			return i;
			}
		}	
	}
}
