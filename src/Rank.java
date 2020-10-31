// YOU CANNOT MODIFY THIS FILE

public enum Rank {
  TWO("2"), 
  THREE("3"), 
  FOUR("4"), 
  FIVE("5"), 
  SIX("6"), 
  SEVEN("7"), 
  EIGHT("8"),
  NINE("9"), 
  TEN("10"), 
  JACK("J"), 
  QUEEN("Q"), 
  KING("K"),
  ACE("A"); 

  private String rank;

  // Constructor
  Rank (String r) {
    rank = r;
  }

  public String toString() {
    return rank;
  }
}
