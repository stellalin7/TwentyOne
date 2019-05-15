package main;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class BowlNoodlesTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void sumTest() {
		assertEquals(10,add(7,3));
	}

	private int add(int i, int j) {
		// TODO Auto-generated method stub
		int sum = i + j;
		return sum;
	}
	
	@Test
	public void test1() {
		assertTrue(trueFunction(29));
	}

	private boolean trueFunction(int i) {
		if(i>=30) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Test
	public void testArrayFunc1() {
		ArrayList <String> nautica = new ArrayList <String>();
		nautica.add("Jared");
		nautica.add("Stephanie");
		nautica.add("Darren");
		nautica.add("Stella");
		//String[] nautica1 = (String[])nautica.toArray();
		assertEquals(nautica,arrayFunc1("Stella"));
	}

	private ArrayList <String> arrayFunc1(String name) {
		ArrayList <String> nautica = new ArrayList <String>();
		nautica.add("Jared");
		nautica.add("Stephanie");
		nautica.add("Darren");
		nautica.add(name);
		nautica.toArray();
		//String[] nautica1 = (String[])nautica.toArray();
		return nautica;
	}
	
	

}
