package IntroToJUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 **/

public class MoreAndMoreTests {

	String multiply(int numberOne, int numberTwo) {
		String product = "" + numberOne * numberTwo;
		return numberOne + " x " + numberTwo + " = " + product;

	}

	@Test
	public void MultTest() {
		assertEquals("10 x 0 = 0", multiply(10, 0));
		assertEquals("10 x 10 = 100", multiply(10, 10));
		assertEquals("8 x 11 = 88", multiply(8, 11));
	}

	boolean isPrime(int prime) {
		for (int i = 2; i < prime; i++) {
			if (prime % i == 0) {
				return false;
			}
		}
		return true;
	}

	@Test
	public void PrimeTest() {
		assertTrue(isPrime(3));
		assertTrue(isPrime(5));
		assertTrue(isPrime(541));
		assertFalse(isPrime(4));
		assertFalse(isPrime(12));
		assertFalse(isPrime(527));
	}

	boolean isSquare(int Square) {
		double x = Math.sqrt(Square);
		int y = (int) x;
		if (y == x) {
			return true;
		} else {
			return false;
		}
	}

	@Test
	public void SquareTest() {

		assertTrue(isSquare(4));
		assertTrue(isSquare(144));
		assertTrue(isSquare(64));
		assertTrue(isSquare(10201));
		assertTrue(isSquare(1));
		assertFalse(isSquare(3));
		assertFalse(isSquare(22));
		assertFalse(isSquare(143));

	}

	boolean isCube(int Cube) {
		double k = Math.cbrt(Cube);
		int l = (int) k;
		if (l == k) {
			return true;
		} else {
			return false;
		}
	}
	
	@Test
	public void CubeTest() {

		assertTrue(isCube(27));
		assertTrue(isCube(216));
		assertTrue(isCube(729));
		assertTrue(isCube(1));
		assertFalse(isCube(3));
		assertFalse(isCube(22));
		assertFalse(isCube(143));

	}

}
