package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void testAdd() {
		assertEquals(10,Calculator.add(7,3));
	}

	void testSubtract() {
		assertEquals(7,Calculator.subtract(10,3));
	}
	
	@Test
	void testMultiply() {
		assertEquals(10, Calculator.multiply(2,5));
	}
	
	@Test
	void testDivide() {
		assertEquals(5, Calculator.divide(10,2));
	}
	
	@Test
	void testModulus() {
		assertEquals(3, Calculator.mod(13,5));
	}
}


