
public class PokerHand {
	static int suit[] = new int[5];
	static int pip[] = new int[5];
	static int[] a = new int[5];
	static int rank=0;
	public PokerHand(int[] a) {
		this.a = a;
	}

	public static String pokerhand() {
		String s;
		for (int i = 0; i < 5; i++) {
			suit[i] = Card.getsuit(a[i]);
			pip[i] = Card.getpip(a[i]);
			//System.out.print(" suit  " + suit[i] + " pip" + pip[i] + "\n");
		}

		return getPokerHand();

	}

	public static String getPokerHand() {

		if (isStraightFlush()) {
			rank = 1;
			return "StraightFlush";
		} else if (isFourOfAKind()) {
			rank = 2;
			return "FourOfAKind";
		} else if (isFullHouse()) {
			
			rank = 3;
			return "FullHouse";
		} else if (isFlush()) {
			
			rank = 4;
			return "Flush";
		} else if (isStraight()) {
			
			rank = 5;
			return "Straight";
		} else if (isThreeOfAKind()) {
			
			rank = 6;
			return "ThreeOfAKind";
		} else if (isTwoPair()) {
			rank = 7;
			return "TwoPair";
		} else if (isOnePair()) {
			rank = 8;
			return "OnePair";
		} else {
			rank = 9;
			return "HighCard";
		}

	}
	public static boolean pokerWinner(PokerHand c){
		
		System.out.println("player1"+rank+"  ");
		System.out.println("player2"+c.rank+"  ");
		return rank<c.rank;
		
		
		
		
		}

	public static boolean isStraightFlush() {

		return isStraight() && isFlush();

	}

	

	public static boolean isFullHouse() {

		return isThreeOfAKind() && isOnePair();
	}

	public static boolean isFlush() {
		int count = 0;
		for (int i = 0; i < 5; i++) {
			if (suit[0] == suit[i]) {
				count++;
			}

		}

		return count == 5;

	}

	public static boolean isStraight() {
		java.util.Arrays.sort(pip);
		if(pip[0]==0) {
			 
			  if(pip[1]==9){
			  
			   for(int i=1;i<4;i++){
			     
			      if(pip[i+1]-pip[i]!=1)
			      return false;
			  }
			  
			  
			  }
			  }else{
		for (int i = 0; i < 4; i++) {

			if (pip[i + 1] - pip[i] != 1)
				return false;
		}}
		return true;
	}

	public static boolean isThreeOfAKind() {
		int count1 = 0, count2 = 0, count3 = 0;
		for (int i = 0; i < 5; i++) {
			if (pip[0] == pip[i])
				count1++;
			if (pip[1] == pip[i])
				count2++;
			if (pip[2] == pip[i])
				count3++;
		}

		return count1 == 3 || count2 == 3 || count3 == 3;

	}

	public static boolean isTwoPair() {
		int count = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (pip[i] == pip[j])
					count++;
			}
		}

		return count == 2;

	}

	public static boolean isOnePair() {

		int count = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (pip[i] == pip[j])
					count++;
			}
		}

		return count == 1;

	}
	public static int getRank() {
		return rank;
	}

	public static boolean isFourOfAKind() {
		int count1 = 0, count2 = 0;
		for (int i = 0; i < 5; i++) {
			if (pip[0] == pip[i]) {
				count1++;
			}
			if (pip[1] == pip[i]) {
				count2++;
			}
		}

		return count1 == 4 || count2 == 4;

	}

}

