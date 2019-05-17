package grocery;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheeseTest {

	@Test
	void testCheeseStringStringIntDoubleDouble() {
		Cheese mascarpone = new Cheese("mascarpone","000000009",20,1.95,5.99);
		assertTrue(mascarpone instanceof Cheese);
	}

}
