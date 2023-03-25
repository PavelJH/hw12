import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        hand = new ArrayList<>();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public List<Card> getHand() {
        return hand;
    }

    public int getPoints() {
        int points = 0;
        int aceCount = 0;
        for (Card card : hand) {
            Rank rank = card.getRank();
            if (rank == Rank.ACE) {
                aceCount++;
            }
            points += rank.getValue();
        }
        while (points > 21 && aceCount > 0) {
            points -= 10;
            aceCount--;
        }
        return points;
    }
}
