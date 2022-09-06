package ujian.ujiankedua;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.*;
import org.testng.annotations.*;
import java.util.*;

public class TestGeometri {
	Geometri ge = new Geometri();
	Random rand = new Random();
	double x = rand.nextDouble(0, 50);
	double y = rand.nextDouble(0, 50);
	String z = Double.toString(rand.nextDouble(0, 50));
	
	@Test(priority = 1)
	public void testLuasPersegi() {
		System.out.println("====================================================");
		System.out.println("TEST LUAS PERSEGI");
		AssertJUnit.assertEquals(ge.luasPersegiActual(x), ge.luasPersegiExpect(x));
		System.out.println("====================================================");
	}
	
	@Test(priority = 2)
	public void testLuasSegitiga() {
		System.out.println("====================================================");
		System.out.println("TEST LUAS SEGITIGA");
		AssertJUnit.assertEquals(ge.luasSegitigaActual(x, y), ge.luasSegitigaExpect(x, y));
		System.out.println("====================================================");
	}
	
	@Test(priority = 3)
	public void testLuasTrapesium() {
		System.out.println("====================================================");
		Double t = Double.parseDouble(z);
		System.out.println("TEST LUAS TRAPESIUM");
		AssertJUnit.assertEquals(ge.luasTrapesiumActual(x, y, z), ge.luasTrapesiumExpect(x, y, t));
		System.out.println("====================================================");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("**TEST GEOMETRI DIMULAI**");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("**TEST GEOMETRI SELESAI** \n");
	}
}
