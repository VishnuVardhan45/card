
public class Hand {
	public String playerHandRanking(Card cards[]) {
		if(isFlush(cards)) {
			return "Player Hand Ranking is Flush";
		} else if(isStraight(cards)) {
			return "Player Hand Ranking is straight";
		} else if(isFlush(cards) && isStraight(cards)) {
			return "player Hand Ranking is straight flush";
		} else if(isFlush(cards) && isStraight(cards) && cards[4].getPip() == 14) {
			return "player Hand Ranking is Royal Flush";
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
	 public static boolean isStraight(Card[] h )
	    {
	       int i, testRank;

	       if ( h.length != 5 )
	          return false;
	       	  sortByRank(h);           
	       if ( h[4].getPip() == 14 )
	       {
	          boolean a = h[0].getPip() == 2 && h[1].getPip() == 3 &&
	                      h[2].getPip() == 4 && h[3].getPip() == 5 ;
	          boolean b = h[0].getPip() == 10 && h[1].getPip() == 11 &&        
	                      h[2].getPip() == 12 && h[3].getPip() == 13 ;

	          return ( a || b );
	       }
	       else
	       {
	          testRank = h[0].getPip() + 1;

	          for ( i = 1; i < 5; i++ )
	          {
	             if ( h[i].getPip() != testRank )
	                return false;     
	             testRank++;   
	          }

	          return true;   
	       }
	    }
}
