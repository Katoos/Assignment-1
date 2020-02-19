import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivideTest {

	@Test
	void test() {
		Calc test = new Calc () ;
		float output = test.divide(4,8);
		assertEquals (0.5,output);
	}
}
