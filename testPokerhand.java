public class cardGame {

	public static void main(String[] args) {

		int a[] = { 5, 14, 2, 3, 4 };
		int b[] = { 15, 46, 22, 31, 4 };

		PokerHand c1 = new PokerHand(a);

		String pokerhand1 = c1.pokerhand();

		System.out.println("player1   " + pokerhand1 + "  ");
		int player1rank = c1.getRank();

		PokerHand c2 = new PokerHand(b);
		String pokerhand2 = c2.pokerhand();
		System.out.println("player2   " + pokerhand2 + "  ");
		int player2rank = c2.getRank();

		if (player1rank < player2rank) {
			System.out.println("player1 is winner");
		} else {
			System.out.println("player2 is winner");
		}

	}
}

