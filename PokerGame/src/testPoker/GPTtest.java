package testPoker;
import org.junit.jupiter.api.Test;

import poker.Poker;

import static org.junit.jupiter.api.Assertions.*;

class GPTtest {
	@Test
    void isFullHouse_withFullHouseHand_returnsTrue() {
        Poker poker = new Poker();
        String[] cards = {"C2", "D2", "H2", "S3", "S3"};
        assertTrue(poker.isFullHouse(cards, cards.length));
    }

    @Test
    void isFullHouse_withThreeOfAKindHand_returnsFalse() {
        Poker poker = new Poker();
        String[] cards = {"C2", "D2", "H2", "S3", "S4"};
        assertFalse(poker.isFullHouse(cards, cards.length));
    }

    @Test
    void isFullHouse_withTwoPairsHand_returnsFalse() {
        Poker poker = new Poker();
        String[] cards = {"C2", "D2", "H3", "S3", "S4"};
        assertFalse(poker.isFullHouse(cards, cards.length));
    }

    @Test
    void isFullHouse_withRandomHand_returnsFalse() {
        Poker poker = new Poker();
        String[] cards = {"C2", "D3", "H4", "S5", "S6"};
        assertFalse(poker.isFullHouse(cards, cards.length));
    }

    @Test
    void isThreeOfaKind_withThreeOfAKindHand_returnsTrue() {
        Poker poker = new Poker();
        String[] cards = {"C2", "D2", "H2", "S3", "S4"};
        assertTrue(poker.isThreeOfaKind(cards, cards.length));
    }

    @Test
    void isThreeOfaKind_withRandomHand_returnsFalse() {
        Poker poker = new Poker();
        String[] cards = {"C2", "D3", "H4", "S5", "S6"};
        assertFalse(poker.isThreeOfaKind(cards, cards.length));
    }

    @Test
    void isTwoPairs_withTwoPairsHand_returnsTrue() {
        Poker poker = new Poker();
        String[] cards = {"C2", "D2", "H3", "S3", "S4"};
        assertTrue(poker.isTwoPairs(cards, cards.length));
    }

    @Test
    void isTwoPairs_withRandomHand_returnsFalse() {
        Poker poker = new Poker();
        String[] cards = {"C2", "D3", "H4", "S5", "S6"};
        assertFalse(poker.isTwoPairs(cards, cards.length));
    }
}
