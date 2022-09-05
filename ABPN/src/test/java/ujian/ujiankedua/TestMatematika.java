package ujian.ujiankedua;
import static org.testng.Assert.*;
import org.testng.annotations.*;
import java.util.*;

public class TestMatematika {
	Matematika mtk = new Matematika();
	Random rand = new Random();
	double a = rand.nextDouble();
	double b = rand.nextDouble();
	
	@Test
	public void tesJumlah() {
		System.out.println("TEST PENJUMLAHAN");
		assertEquals(mtk.jumlahActual(a, b), mtk.jumlahExpect(a, b));
	}
	
	@Test
	public void tesKurang() {
		System.out.println("TES PENGURANGAN");
		assertEquals(mtk.kurangActual(a, b), mtk.kurangExpect(a, b));
	}
	
	@Test
	public void tesBagi() {
		System.out.println("TES PEMBAGIAN");
		assertEquals(mtk.bagiActual(a, b), mtk.bagiExpect(a, b));
	}
	
	@Test
	public void tesModulus() {
		System.out.println("TES MODULUS");
		assertEquals(mtk.modulusActual(a, b), mtk.modulusExpect(a, b));
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("TEST ARITMATIKA DIMULAI");
	}
	
	@AfterTest
	public void afterTes() {
		System.out.println("TEST ARITMATIKA SELESAI");
	}
}
