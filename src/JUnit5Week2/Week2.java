package JUnit5Week2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

public class Week2 {

	// 1
	// AssertEquals to lower case A,
	// Add missing quote sign
	// Changed name from b to text
	@Test
	public void Writing_Sometext_Backwards() {

		StringBuilder text = new StringBuilder("Jag");
		String reversed = text.reverse().toString();

		assertEquals("reverse", "gaJ", reversed);
	}

	// 2
	// String changed to void.
	// Changed name of method
	@Test
	public void matchingNames() {
		String name = "My name";
		assertEquals("My name", name);
	}

	// 3
	// Made into separate unit tests.
	// Changed names of method
	// changed names of variables
	@Test
	public void FName() {
		String fName = "first name";
		assertEquals("first name", fName);
	}

	@Test
	public void LName() {
		String lName = "last name";
		assertEquals("last name", lName);
	}

	@Test
	public void Number() {
		int pNumber = 0701111111;
		assertEquals(0701111111, pNumber);
	}

	@Test
	public void Adress() {
		String address = "my cool street";
		assertEquals("my cool street", address);
	}

	// 4
	// New test with string.length() method.
	// Changed name of method
	@Test
	public void LengthOfString() {
		String string = "JUnit 5";
		assertEquals(7, string.length());
		System.out.println(string.length());
	}

	// 5
	// @Test was missing
	// Change method name
	@Test
	public void SameInt() {
		assertEquals(100, 100);
	}

	// 6
	// Changed name of method
	// Changed value of second string to s2 = s1
	@Test
	public void SameString() {
		String s1 = new String("S1");
		String s2 = s1;
		assertSame(s1, s2);
	}

	// 7
	// Changed name of method
	// Changed assertion to assertTrue with ==
	@Test
	public void CheckingBytes() {
		byte smallByte1 = 100;
		byte smallByte2 = smallByte1;
		assertTrue(smallByte1 == smallByte2);
	}

	// 9
	// Changed value of second object to obj2 = obj1
	@Test
	public void CheckingTrue() {
		Object obj1 = new Object();
		Object obj2 = obj1;
		assertTrue(obj1 == obj2);
	}

	// 10
	// Changed assertion to assertTrue
	@Test
	public void CheckingFalse() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		assertTrue(obj1 != obj2);
	}

}
