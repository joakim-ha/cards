import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Deck {

    List<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
        // ToDo: Add all 52 cards to deck
        throw new RuntimeException("Deck must be populated");
    }

    public void shuffle() {
        // ToDo: Shuffle deck
        throw new RuntimeException("Not implemented yet");
    }


    private String constructStringRep(boolean compact) {
        StringBuilder str = new StringBuilder();
        for (Card card : deck) {
            if (compact) {
                str.append(card.toCompactString());
            } else {
                str.append(card.toString());
            }
            str.append("\n");
        }
        return str.toString();
    }

    public String toCompactString() {
        return constructStringRep(true);
    }

    public String toString() {
        return constructStringRep(false);
    }

    public Card showTopCard() {
        return deck.getFirst();
    }

    public Card removeTopCard() {
        return deck.removeFirst();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deck deck1 = (Deck) o;
        return Objects.equals(deck, deck1.deck);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(deck);
    }
}
