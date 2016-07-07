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
		
		
		
		return null;
		
	
		}

}

