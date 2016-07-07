
public class Hand {
	public String playerHandRanking(Card cards[]) {
		if(isFlush(cards)) {
			return "Player Hand Ranking is Flush";
		}
		
		return "something";
	}
	public static void sortBySuit( Card[] c )
	   {
	      int i, j, min_j;
	      for ( i = 0 ; i < c.length ; i ++ )
	      {min_j = i;   
	         for ( j = i+1 ; j < c.length ; j++ )
	         {
	            if ( c[j].getSuit() < c[min_j].getSuit() )
	            {
	               min_j = j;   
	            }
	         }
	         Card help = c[i];
	         c[i] = c[min_j];
	         c[min_j] = help;
	      }
	   }
	public boolean isFlush(Card[] cards) {
		sortBySuit(cards);
 		return cards[0].getSuit() == cards[4].getSuit();
	}
	 public static void sortByRank( Card[] c )
	   {
	      int i, j, min_j;
	      for ( i = 0 ; i < c.length ; i ++ )
	      {
	         min_j = i;   	     
	      for ( j = i+1 ; j < c.length ; j++ )
	         {
	            if ( c[j].getPip() < c[min_j].getPip() )
	            {
	               min_j = j;         
	            }
	         }
	      	 Card help = c[i];
	         c[i] = c[min_j];
	         c[min_j] = help;
	      }
	   }
}
