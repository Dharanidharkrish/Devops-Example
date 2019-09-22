import static org.junit.Assert.*;

import org.junit.Test;

public class SumOfNumbersTest {

	@Test
	public void testCase() {
		SumOfNumbers sm=new SumOfNumbers();
		assertEquals(10, sm.add(5, 5));
	}

}
