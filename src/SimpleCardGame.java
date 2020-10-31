public class SimpleCardGame {

  public static void main(String[] args) {

    Card cards[] = new Card[52];  // an array of Cards, representing a deck of cards

    // put a copy of each card into cards
    // The order of the cards in the array is: 
    // S2, S3, ..., SK, H2, ..., HK, C2, ..., CK, D2, ..., DK
	int i = 0;
	for (Suit suits: Suit.values()) {
		for (Rank ranks: Rank.values()) {
			cards[i] = new Card (ranks, suits);
			i++;
		}
	}


    //
    // YOU DO NOT HAVE TO MODIFY ANYTHING BELOW
    //
    // print out the whole deck once
    System.out.println("The whole deck is:");
    for (Card card : cards)
      System.out.print(card + " ");
    System.out.println();
    
    // randomly draw two cards 
    MyRandom rnd = new MyRandom();
    Card c1 = cards[rnd.nextInt(cards.length)-1];
    Card c2 = cards[rnd.nextInt(cards.length)-1];

    System.out.println("Two cards are drawn:");
    System.out.println("c1 = " + c1 + " and c2 = " + c2);

    // compare c1 and c2
    if (c1.compareTo(c2) < 0) {
      System.out.println(c1 + " is smaller than " + c2);
    }
    else if (c1.compareTo(c2) == 0) { 
      System.out.println(c1 + " is the same as " + c2); 
    }
    else {
      System.out.println(c1 + " is larger than " + c2);
    }
  }
}
