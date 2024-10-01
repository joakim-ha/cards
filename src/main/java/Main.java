public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println("New deck: ");
        System.out.println(deck);
        deck.shuffle();
        System.out.println("\n\nAfter shuffle: ");
        System.out.println(deck);

        System.out.println("\n\nCompact representation: ");
        System.out.println(deck.toCompactString());
    }
}
