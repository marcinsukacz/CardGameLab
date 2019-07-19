import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Deck deck;
    Card card1;
    Card card2;
    Player player1;
    Player player2;

    @Before
    public void setup(){
        card1 = new Card(SuitType.HEARTS, RankType.QUEEN);
        card1 = new Card(SuitType.SPADES, RankType.NINE);
        player1 = new Player();
        deck = new Deck();
        deck.populateDeck();
    }

    @Test
    public void noCardsInHand(){
        assertEquals(0, player1.cardCount());
    }


    @Test
    public void playerCanTakeCard(){
        player1.takeCard(deck.dealCard());
        player1.takeCard(deck.dealCard());
        assertEquals(2, player1.cardCount());
    }

    @Test
    public void showValueOfCards(){
        player1.takeCard(card1);
        player1.takeCard(card2);
        assertEquals(19, player1.valueOfCards());



    }


}
