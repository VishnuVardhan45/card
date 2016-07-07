
public class Hand {
	public String playerHandRanking(Card cards[]) {
		if(isFlush(cards)) {
			return "Player Hand Ranking is Flush";
		} 
		if(isStraight(cards)) {
			return "Player Hand Ranking is straight";
		} 
		if(isFlush(cards) && isStraight(cards)) {
			return "player Hand Ranking is straight flush";
		}
		if(isFlush(cards) && isStraight(cards) && cards[4].getPip() == 14) {
			return "player Hand Ranking is Royal Flush";
		}
		if(isFourOfAKind(cards)) {
			return "Player Hand Ranking is four of a kind";
		}
		if ( isFullHouse(cards)) {
			return "player Hand Ranking is Full House";
		}
		if ( isSet(cards)) {
			return "Player Hand Ranking is Three Of a Kind";
		}
		if( isTwoPair ( cards ) ) {
			return "Player Hand Ranking is Two Pair";
		}
		return "something";
	}
	public static void sortBySuit( Card[] cs )
	   {
	      int i, j, min_j;
	      for ( i = 0 ; i < cs.length ; i ++ )
	      {min_j = i;   
	         for ( j = i+1 ; j < cs.length ; j++ )
	         {
	            if ( cs[j].getSuit() < cs[min_j].getSuit() )
	            {
	               min_j = j;   
	            }
	         }
	         Card help = cs[i];
	         cs[i] = cs[min_j];
	         cs[min_j] = help;
	      }
	   }
	public boolean isFlush(Card[] cards) {
		sortBySuit(cards);
 		return cards[0].getSuit() == cards[4].getSuit();
	}
	 public static void sortByRank( Card[] cr )
	   {
	      int i, j, min_j;
	      for ( i = 0 ; i < cr.length ; i ++ )
	      {
	         min_j = i;   	     
	      for ( j = i+1 ; j < cr.length ; j++ )
	         {
	            if ( cr[j].getPip() < cr[min_j].getPip() )
	            {
	               min_j = j;         
	            }
	         }
	      	 Card help = cr[i];
	         cr[i] = cr[min_j];
	         cr[min_j] = help;
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
	 public static boolean isFourOfAKind( Card[] h )
	   	{
	      boolean a1, a2;
	      if ( h.length != 5 )
	         return(false);

	      sortByRank(h);         
	      a1 = h[0].getPip() == h[1].getPip() &&
	           h[1].getPip() == h[2].getPip() &&
	           h[2].getPip() == h[3].getPip() ;
	      a2 = h[1].getPip() == h[2].getPip() &&
	           h[2].getPip() == h[3].getPip() &&
	           h[3].getPip() == h[4].getPip() ;

	      return ( a1 || a2 );
	   }
  	public static boolean isFullHouse( Card[] h )
   		{
      		boolean a1, a2;

      		if ( h.length != 5 )
         	return(false);

      		sortByRank(h);      	
		    a1 = h[0].getPip() == h[1].getPip() &&
           	h[1].getPip() == h[2].getPip() &&
           	h[3].getPip() == h[4].getPip();
		    a2 = h[0].getPip() == h[1].getPip() &&
            h[2].getPip() == h[3].getPip() &&
            h[3].getPip() == h[4].getPip();

      		return( a1 || a2 );
   }
	public static boolean isSet( Card[] h )
   		{
      boolean a1, a2, a3;

      if ( h.length != 5 )
         return false;

      if ( isFourOfAKind(h) || isFullHouse(h) )
         return false;                 

      sortByRank(h);
	  a1 = h[0].getPip() == h[1].getPip() &&                  
           h[1].getPip() == h[2].getPip() ;
	  a2 = h[1].getPip() == h[2].getPip() &&
           h[2].getPip() == h[3].getPip() ;
	  a3 = h[2].getPip() == h[3].getPip() &&
           h[3].getPip() == h[4].getPip() ;

      return( a1 || a2 || a3 );
   }
	public static boolean isTwoPair( Card[] h )
   		{
      boolean a1, a2, a3;

      if ( h.length != 5 )
         return false;

     if ( isFourOfAKind(h) || isFullHouse(h) || isSet(h) )
         return false;             
      sortByRank(h);                      
      a1 = h[0].getPip() == h[1].getPip() &&
           h[2].getPip() == h[3].getPip() ;
      a2 = h[0].getPip() == h[1].getPip() &&
           h[3].getPip() == h[4].getPip() ;
      a3 = h[1].getPip() == h[2].getPip() &&
           h[3].getPip() == h[4].getPip() ;

      return( a1 || a2 || a3 );
   }			
}
