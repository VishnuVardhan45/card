public class cards {
	static int suit[] = new int[5];
	static int pip[] = new int[5];
	static int[] a= new int[5];
	 String[] cdhs = { "club", "diamond", "heart", "spade" };
	 String pips = "A23456789TJQK";
	public cards(int[] a){
 this.a = a;
}
	
	public static int getsuit(int seq) {
		return seq/13;
	}

	public static int getpip(int seq) {
		return seq%13;
	}

	public static String pokerhand() {
		
		for(int i = 0; i <5 ; i++){
			suit[i]=getsuit(a[i]);
			pip[i]= getpip(a[i]);
			System.out.println(suit[i]+"  "+pip[i]);
		}
		
		
		
		return getPokerHand();
		
	
		}
	public static String getPokerHand() {

		if (isStraightFlush()) {
			return "StraightFlush";
		} else if (isFourOfAKind()) {
			return "FourOfAKind";
		} else if (isFullHouse()) {
			return "FullHouse";
		} else if (isFlush()) {
			return "Flush";
		} else if (isStraight()) {
			return "Straight";
		} else if (isThreeOfAKind()) {
			return "ThreeOfAKind";
		} else if (isTwoPair()) {
			return "TwoPair";
		} else if (isOnePair()) {
			return "OnePair";
		} else {
			return "HighCard";
		}

	}

	public static boolean isStraightFlush() {

		return isStraight() && isFlush();

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

}

