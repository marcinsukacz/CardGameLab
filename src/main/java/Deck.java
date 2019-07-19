import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<Card>();
    }

    public int countCards() {
        return this.cards.size();
    }

    public void populateDeck() {

         for(SuitType suit: SuitType.values()){
             for(RankType rank: RankType.values()){
                 cards.add(new Card(suit, rank));
             }

         }
    }


    public void shuffleDeck() {

        Collections.shuffle(this.cards);

    }

    public Card dealCard() {
        return this.cards.remove(0);

    }
}
