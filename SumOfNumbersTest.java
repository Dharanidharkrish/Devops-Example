import static org.junit.Assert.*;

import org.junit.Test;

public class SumOfNumbersTest {

	@Test
	public void testCase() {
		SumOfNumbers so=new SumOfNumbers();
		int sol=so.add(20, 30);
		assertEquals(50, sol);
	}

}
