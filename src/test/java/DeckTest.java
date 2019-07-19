import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Deck deckShuffled;
    Card card;

    @Before
    public void before(){

        deck = new Deck();
        deckShuffled = new Deck();

    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.countCards());
    }

    @Test
    public  void deckCanBePopulated(){
        deck.populateDeck();
        assertEquals(52, deck.countCards());
    }

    @Test
    public void canDealCard(){
        deck.populateDeck();
        deck.dealCard();
        assertEquals(51, deck.countCards());
    }

//    @Test
//    public void deckCanBeShuffled(){
//        deck.populateDeck();
//        deckShuffled = deck.shuffleDeck();
//        assertEquals(deck, deckShuffled);
//
//    }
}
