import java.util.ArrayList;

public class Player {

    private ArrayList<Card> cards;

    public Player() {
        this.cards = new ArrayList<Card>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int cardCount() {
        return this.cards.size();
    }

    public void takeCard(Card card) {
        this.cards.add(card);
    }

    public int valueOfCards() {
        int totalValue = 0;
        for(int i = 0; i <= cards.sise(); i++){

            totalValue += cards(i).RankType.getValue();




        }
    }
}
