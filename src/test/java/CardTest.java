import static org.junit.jupiter.api.Assertions.assertEquals;

class CardTest {

    Card aceOfDiamonds = new Card(Card.Rank.ACE, Card.Suit.DIAMONDS);
    Card queenOfSpades = new Card(Card.Rank.QUEEN, Card.Suit.SPADES);
    Card threeOfHearts = new Card(Card.Rank.THREE, Card.Suit.HEARTS);
    Card tenOfClubs = new Card(Card.Rank.TEN, Card.Suit.CLUBS);
    Card jackOfClubs = new Card(Card.Rank.JACK, Card.Suit.CLUBS);

    @org.junit.jupiter.api.Test
    void testToString() {
        assertEquals("Ace of Diamonds", aceOfDiamonds.toString());
        assertEquals("Queen of Spades", queenOfSpades.toString());
        assertEquals("Three of Hearts", threeOfHearts.toString());
        assertEquals("Jack of Clubs", jackOfClubs.toString());
        assertEquals("Ten of Clubs", tenOfClubs.toString());
    }

    @org.junit.jupiter.api.Test
    void testToCompactString() {
        assertEquals("A♦", aceOfDiamonds.toCompactString());
        assertEquals("Q♠", queenOfSpades.toCompactString());
        assertEquals("3♥", threeOfHearts.toCompactString());
        assertEquals("10♣", tenOfClubs.toCompactString());
        assertEquals("J♣", jackOfClubs.toCompactString());
    }

    @org.junit.jupiter.api.Test
    void testGetNumericValue() {
        assertEquals(1, aceOfDiamonds.rank().getNumericValue());
        assertEquals(12, queenOfSpades.rank().getNumericValue());
        assertEquals(3, threeOfHearts.rank().getNumericValue());
        assertEquals(10, tenOfClubs.rank().getNumericValue());
        assertEquals(11, jackOfClubs.rank().getNumericValue());
    }

}