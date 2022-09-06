package ujian.ujiankedua;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.*;

import java.util.Random;

import org.testng.annotations.*;

public class TestParseToNum {
	ParseToNum ptm = new ParseToNum();
	Random rand = new Random();
	
	@Test(priority = 1)
	public void TestInt() {
		System.out.println("====================================================");
		System.out.println("TES STRING TO INT");
		String testI = Integer.toString(rand.nextInt());
		System.out.println("INI TEST STRING TO INT");
		AssertJUnit.assertEquals(ptm.parseIntActual(testI), ptm.parseIntExpect(testI));
		System.out.println("====================================================");
	}
	
	@Test(priority = 2)
	public void TestDouble() {
		System.out.println("====================================================");
		System.out.println("TES STRING TO DOUBLE");
		String testI = Double.toString(rand.nextDouble());
		System.out.println("INI TEST STRING TO DOUBLE");
		AssertJUnit.assertEquals(ptm.parseDoubleActual(testI), ptm.parseDoubleExpect(testI));
		System.out.println("====================================================");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("**TEST STRING TO NUMERIC DIMULAI**");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("**TEST STRING TO NUMERIC SELESAI** \n");
	}
}
