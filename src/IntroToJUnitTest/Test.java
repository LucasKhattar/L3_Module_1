package IntroToJUnitTest;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		assertEquals( 7, add(4,4));
	}
	
	int add(int numberOne, int numberTwo){
		int sum = numberOne+numberTwo;
		return sum;
		
		 
	}

}
