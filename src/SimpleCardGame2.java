import java.util.ArrayList;

public class SimpleCardGame2 {
	
  private static void addCard(ArrayList<Card> cards, Card c) {
	   int i = 0;
	   while (i < cards.size() && cards.get(i).compareTo(c) < 0) {
	    	 i++;
	   }
	   cards.add(i, c); 
  }
	
  private static int numPairs(ArrayList<Card> cards) {
	  int same = 0;
	  for (int i = 0; i < 9; i++) {
		  if (cards.get(i).rankCompare(cards.get(i+1)) == 1) {
			  same++;
		  }
	  }
	  int numpair = 0;
	  if (same >= 2 && same < 3) {
	        numpair = 1;
	     }
	     else if (same >= 3 && same <= 4) {
	        numpair = 2;
	     }
	     else if (same > 5 && same <= 6) {
	        numpair = 3;
	     }
	     else if (same >= 7 && same < 8) {
	        numpair = 4;
	     }
	     else if (same >= 9 && same <= 10) {
	        numpair = 5;
	     }
	     else {
	        numpair = 0;
	     }

	  return numpair;
  }
  
  public static void main(String[] args) {
	
    ArrayList<Card> deck = new ArrayList<Card>();  // an arraylist of Cards, representing a deck of cards

    // put a copy of each card into cards
    // The order of the cards in the array is: 
    // S2, S3, ..., SK, H2, ..., HK, C2, ..., CK, D2, ..., DK

	for (Suit suits: Suit.values()) {
		for (Rank ranks: Rank.values()) {
			deck.add(new Card (ranks, suits));
		}
	}

    //
    // YOU DO NOT HAVE TO MODIFY ANYTHING BELOW
    //

    // print out the whole deck once
    System.out.println("The whole deck is:");
    System.out.println(deck);
    
    // randomly draw 10 cards
    // cards drawn will be removed from deck 
    MyRandom rnd = new MyRandom();
    ArrayList<Card> cards = new ArrayList<Card>();
    for (int i = 0; i < 10; i++)
      addCard(cards, deck.remove(rnd.nextInt(deck.size())-1));


    // print out the card drawn and the number of pairs
    System.out.print("The cards drawn are: ");
    System.out.println(cards);
    System.out.print("There are ");
    System.out.print(numPairs(cards));
    System.out.println(" pair(s) of cards.");
  }
}
