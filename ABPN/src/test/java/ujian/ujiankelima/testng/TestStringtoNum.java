package ujian.ujiankelima.testng;

import static org.testng.Assert.*;
import java.util.Random;
import org.testng.annotations.*;
import org.apache.commons.lang3.RandomStringUtils;

public class TestStringtoNum {
	StringtoNum stm;
	Random rand;
	String strValue = "";
	int intLength = 0;
	boolean useLetter = false;
	boolean useNumber = true;
	
	@BeforeTest
	public void befTest() {
		stm = new StringtoNum();
		rand = new Random();
		intLength = rand.nextInt(0, 25);
	}
	
	@Test(priority = 1)
	public void TestInt() {
		System.out.println("====================================================");
		System.out.println("TES STRING TO INT");
		strValue = RandomStringUtils.random(intLength, useLetter, useNumber);
		System.out.println("INI TEST STRING TO INT");
		assertEquals(stm.parseIntActual(strValue), stm.parseIntExpect(strValue));
		System.out.println("====================================================");
	}
	
	@Test(priority = 2)
	public void TestDouble() {
		System.out.println("====================================================");
		System.out.println("TES STRING TO DOUBLE");
		strValue = RandomStringUtils.random(intLength, useLetter, useNumber);
		System.out.println("INI TEST STRING TO DOUBLE");
		assertEquals(stm.parseDoubleActual(strValue), stm.parseDoubleExpect(strValue));
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
