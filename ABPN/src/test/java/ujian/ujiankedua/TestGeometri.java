package ujian.ujiankedua;
import static org.testng.Assert.*;
import org.testng.annotations.*;
import java.util.*;

public class TestGeometri {
	Geometri ge = new Geometri();
	Random rand = new Random();
	double x = rand.nextDouble(0, 50);
	double y = rand.nextDouble(0, 50);
	String z = Double.toString(rand.nextDouble(0, 50));
	
	@Test
	public void testLuasPersegi() {
		System.out.println("TEST LUAS PERSEGI");
		assertEquals(ge.luasPersegiActual(x), ge.luasPersegiExpect(x));
	}
	
	@Test
	public void testLuasSegitiga() {
		System.out.println("TEST LUAS SEGITIGA");
		assertEquals(ge.luasSegitigaActual(x, y), ge.luasSegitigaExpect(x, y));
	}
	
	@Test
	public void testLuasTrapesium() {
		Double t = Double.parseDouble(z);
		System.out.println("TEST LUAS TRAPESIUM");
		assertEquals(ge.luasTrapesiumActual(x, y, z), ge.luasTrapesiumExpect(x, y, t));
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("TEST GEOMETRI DIMULAI");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("TEST GEOMETRI SELESAI");
	}
}
