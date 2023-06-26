package string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Even_Digit_SumTest {

	@Test
	void checkSum() {
		Even_Digit_Sum es = new Even_Digit_Sum();
		
		int sum = es.main();
		
		assertEquals(5, sum);
	}

}
