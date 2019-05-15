package twentyOne;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class TwentyOneTest {
	
	private static final long VALUES_TO_TEST = 1000;
	
	@Test
    public void testGetIndex() {
        for (int i=0; i < VALUES_TO_TEST; i++) {
        	assertTrue(TwentyOne.getIndex()<13);
        }
    }
	
	@Test
	public void testDealerHand() {
		for (int i=0; i < VALUES_TO_TEST; i++) {
        	assertTrue(TwentyOne.dealerHand()<=21);
        }
	}
	
	@Test
	public void testDealerNext() {
		for (int i=0; i < VALUES_TO_TEST; i++) {
			Random rand = new Random();
			int randomBeginningScore = rand.nextInt(3);
        	assertTrue(TwentyOne.dealerNext(randomBeginningScore)<=21);
        }
	}
	
	@Test
	void testCompareHands() {
		assertTrue(TwentyOne.compareHands(21, 21));
	}
	
}
