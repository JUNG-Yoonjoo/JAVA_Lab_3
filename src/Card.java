public class Card {

	private Rank r;
	private Suit s;
	
	public Card (Rank rank, Suit suit) {
		r = rank;
		s = suit;
	}
	
	public String toString() {
		String s1 = s.toString();
		String r1 = r.toString();
		return s1 + r1;
	}
	
	public int compareTo(Card c) {
		int c1Suit = 0;
		int c2Suit = 0; 
		int c1Rank = 0;
		int c2Rank = 0;

		
		for (Suit checkSuit : Suit.values()) {
			if (checkSuit == s) {
				c1Suit = checkSuit.ordinal();
			}
		}
		for (Suit checkSuit : Suit.values()) {
			if (checkSuit == c.s) {
				c2Suit = checkSuit.ordinal();
			}
		}
		for (Rank checkRank : Rank.values()) {
			if (checkRank == r) {
				c1Rank = checkRank.ordinal();
			}
		}
		for (Rank checkRank : Rank.values()) {
			if (checkRank == c.r) {
				c2Rank = checkRank.ordinal();
			}
		}
		
		if (c1Rank == c2Rank) {
			if (c1Suit < c2Suit) {
				return 1;
			}
			else if (c1Suit == c2Suit) {
				return 0;
			}
			else {
				return - 1;
			}
		}
		else if (c1Rank > c2Rank) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	public int rankCompare(Card c) {
		int c1Rank = 0;
		int c2Rank = 0;
		for (Rank checkRank : Rank.values()) {
			if (checkRank == r) {
				c1Rank = checkRank.ordinal();
			}
		}
		for (Rank checkRank : Rank.values()) {
			if (checkRank == c.r) {
				c2Rank = checkRank.ordinal();
			}
		}
		if (c1Rank == c2Rank) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	public int suitCompare(Card c) {
		int c1Suit = 0;
		int c2Suit = 0;
		for (Suit checkSuit : Suit.values()) {
			if (checkSuit == s) {
				c1Suit = checkSuit.ordinal();
			}
		}
		for (Suit checkSuit : Suit.values()) {
			if (checkSuit == c.s) {
				c2Suit = checkSuit.ordinal();
			}
		}
		if (c1Suit == c2Suit) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
