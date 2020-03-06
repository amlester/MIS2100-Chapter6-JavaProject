import static org.junit.Assert.*;

import org.junit.Test;

import Lester.Alisha.Chapter6.JavaProject.SimpleMath;

public class SimpleMathTest {

	@Test
	public void testThatZeroNumeratorReturnsZero() {
		SimpleMath bubbles = new SimpleMath();
		assertEquals(bubbles.divide(0 , 7),0,0);
	}
	@Test
	public void  testThatSmallerNumeratorReturnsDecimalValue() {
		SimpleMath bubbles = new SimpleMath();
		assertEquals(bubbles.divide(1 , 4),.25,0);
	}
	@Test(expected = ArithmeticException.class)
	public void  testThatZeroDenominatorThrowsException() {
		SimpleMath bubbles = new SimpleMath();
		bubbles.divide(6 , 0);
	}

}
