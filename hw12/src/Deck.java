import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards, new Random());
    }

    public List<Card> deal(int numCards) {
        List<Card> hand = new ArrayList<>();
        for (int i = 0; i < numCards; i++) {
            hand.add(cards.remove(0));
        }
        return hand;
    }

    public int size() {
        return cards.size();
    }
}
