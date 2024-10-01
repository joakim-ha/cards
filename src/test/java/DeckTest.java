import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @org.junit.jupiter.api.Test
    void testCreateDeckAndRemoveTopCardUntilDeckIsEmpty() {
        Deck deck = new Deck();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                Card nextCard = deck.removeTopCard();
                assertEquals(rank, nextCard.rank());
                assertEquals(suit, nextCard.suit());
            }
        }
        assertThrows(NoSuchElementException.class, deck::removeTopCard);
    }

    @org.junit.jupiter.api.Test
    void testShuffle() {
        Deck deckOne = new Deck();
        Deck deckTwo = new Deck();

        assertEquals(deckOne, deckTwo);
        deckOne.shuffle();
        assertNotEquals(deckOne, deckTwo);
        // To discuss: What are the odds of a 'false negative'?
    }

    @org.junit.jupiter.api.Test
    void testShowTopCard() {
        Deck deck = new Deck();
        Card topCard = deck.showTopCard();

        assertEquals(Card.Rank.ACE, topCard.rank());
        assertEquals(Card.Suit.HEARTS, topCard.suit());
    }


}