package Lab1_1;

import static org.junit.Assert.*;
import org.junit.Test;

public class test {

	public static final double EPS = 0.1;

	@Test
	public void test1() {
		int[] arrTest = new int[] {1, -50, 5, 17, -99};
		int expResult = 0;
		int result = MainCode.minNum(arrTest);
		assertEquals(expResult, result, EPS);
	}
	@Test
	public void test2() {
		int[] arrTest = new int[] {1, -50, 5, 17, -99};
		int expResult = -45;
		int result = MainCode.plusNum(arrTest);
		assertEquals(expResult, result, EPS);
	}
}
