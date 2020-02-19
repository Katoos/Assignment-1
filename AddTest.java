import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	void test() {
		Calc test = new Calc () ;
		int output = test.add(1, 0);
		assertEquals (1,output);
	}

}
