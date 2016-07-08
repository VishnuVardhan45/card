public class Card {
    
    
    public static int getsuit(int seq) {
        return seq / 13;
    }

    public static int getpip(int seq) {
        return seq % 13;
    }

    

}
