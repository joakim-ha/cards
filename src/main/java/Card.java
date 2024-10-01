public record Card(Rank rank, Suit suit) {

    // ToDo: Complete the implementations of Rank and Suit

    public enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN,
        EIGHT, NINE, TEN, JACK, QUEEN, KING;


        public String toCompactString() {
            // ToDo: Should return string with numeric values for cards 2-10; one of "2", "3", ..., "10"
            // ToDo: Should return string with single letter for cards A, J, Q, K
            throw new RuntimeException("Not implemented yet");
        }

        @Override
        public String toString() {
            // ToDo: Should return "full description"; one of "Ace", "Two", "Three", ..., "Jack", "Queen", "King"
            throw new RuntimeException("Not implemented yet");
        }

        public int getNumericValue() {
            // ToDo: Should return a value between 1..13
            throw new RuntimeException("Not implemented yet");
        }
    }


    public enum Suit {
        HEARTS, DIAMONDS, CLUBS, SPADES;
        
        public char toSymbol() {
            // ToDo: Should return the unicode char for a suit; one of '♥', '♦', '♣', '♠'
            throw new RuntimeException("Not implemented yet");
        }

        @Override
        public String toString() {
            // ToDo: Should return the name of the suit; one of "Hearts", "Diamonds", "Clubs", "Spades"
            throw new RuntimeException("Not implemented yet");
        }
    }

    @Override
    public String toString() {
        return rank.toString() + " of " + suit.toString();
    }

    public String toCompactString() {
        return rank.toCompactString() + suit.toSymbol();
    }
}
