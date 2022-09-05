package ujian.ujiankedua;

import static org.testng.Assert.*;

import java.util.Random;

import org.testng.annotations.Test;

public class TestParseToNum {
	ParseToNum ptm = new ParseToNum();
	Random rand = new Random();
	
	@Test
	public void TestInt() {
		String testI = Integer.toString(rand.nextInt(0, 100));
		System.out.println("INI TEST STRING TO INT");
		assertEquals(ptm.parseIntActual(testI), ptm.parseIntExpect(testI));
	}
	
	@Test
	public void TestDouble() {
		String testI = Double.toString(rand.nextDouble(0.0, 100.0));
		System.out.println("INI TEST STRING TO DOUBLE");
		assertEquals(ptm.parseDoubleActual(testI), ptm.parseDoubleExpect(testI));
	}
}
