import java.util.*;


public class Poker {

	//String[] suits = {"CLUB", "DIAMONDS", "HEARTS", "SPADES"};
	//String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	Card[] hand;
	int rank;
	String suit;
	Poker(Card c1, Card c2, Card c3, Card c4, Card c5) {
		
		hand[0] = c1;
		hand[1] = c2;
		hand[2] = c3;
		hand[3] = c4;
		hand[4] = c5;
		evaluateRank();
		}
	
	public String result() {
		String status =" ";
		
		Switch(rank) {
			case 0:
				return status += "there is error in your code dumbass coz zero is just an assumption";
			
			case 1: 
				return status += "one Pair";
				
			case 2:
				return status += "Two pairs";
				
			case 3:
				return status += "Three of a kind";
				
			case 4:
				return status += "flush";
				
			case 5:
				return status += " ";
				
			case 6:
				return status += " ";
				
			case 7:
				return status +=  " ";
				
			case 8:
				return status +=  " ";
		}
		return status;
	}
	
	public int getRank() {
		return rank;
	}
	public String getSuit() {
		return suit;
	}
	public void evaluateRank() {
	
		Card[] sorted = new Card[5];
		for(int i=0; i<4; i++) {
			sorted[i] = hand[i];
		}
		Arrays.sort(sorted);
		int pairindex = -1;
		
		rank = 0;
		
		//for chacking pair
		for(int i=0; i<4; i++) {
			if(sorted[i].getRank() == sorted[i+1].getRank()) {
				pairindex = i;
				rank = 1;
				i = 4;
			}
		}
		//for checking 2 pair
		if(rank == 1) {
			for(int i = pairindex + 2; i<4; i++) {
				if(sorted[i].getRank() == sorted[i + 1].getRank())
					rank = 2;
			}
		}
		
		//3 of a kind
		for(int i =0; i<3; i++) {
			if(sorted[i].getRank() == sorted[i+1].getRank() && sorted[i+1].getRank() == sorted[i+2].getRank()) {
				rank = 3;
			}
			if(i==0 && sorted[3].getRank() == sorted[4].getRank() || i==2 && sorted[0].getRank() == sorted[1].getRank())
				rank = 6;
		}
		//check for flush
		boolean flush;
		if(rank == 0 || rank == 4) {
			flush = true;
			for(int i=0; i<4; i++) {
				if(sorted[i].getSuit() != sorted[i+1].getSuit()) {
					flush = false;
				}
			}
			if(flush && rank == 4)
				rank = 8;
			else if(flush)
				rank = 5;
		}
		
		public void sort(Card[] a) {
			
		}
	}
	
	
	}


