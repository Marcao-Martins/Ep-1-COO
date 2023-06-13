import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> cards;

    public Deck(Card[] initialCards) {
        cards = new ArrayList<>();
        Collections.addAll(cards, initialCards);
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void addCards(Card[] newCards) {
        Collections.addAll(cards, newCards);
    }

    public Card[] drawCards(int numCards) {
        if (numCards > cards.size()) {
            throw new IllegalArgumentException("Nao tem cartas");
        }

        List<Card> drawnCards = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numCards; i++) {
            int randomIndex = random.nextInt(cards.size());
            Card drawnCard = cards.remove(randomIndex);
            drawnCards.add(drawnCard);
        }

        return drawnCards.toArray(new Card[0]);
    }

    public int getNumCards() {
        return cards.size();
    }
}
