import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivideTest {

	@Test
	void test() {
		Calc test = new Calc () ;
		assertEquals (2,test.divide(4,2));
		assertEquals (-2,test.divide(-4,2));
		assertEquals (-2,test.divide(4,-2));
		assertEquals (2,test.divide(-4,-2));
		assertEquals (0.5,test.divide(2,4));
		assertEquals (-0.5,test.divide(-2,4));
		assertEquals (-0.5,test.divide(2,-4));
		assertEquals (0.5,test.divide(-2,-4));
		assertEquals (1,test.divide(-2,-2));
	
		try {
			test.divide(4,0);
		}
		catch (RuntimeException e) {
			System.out.println("Undefined Number!");
		}
		
	}
	
}
