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

public class TestMatematika {
	Matematika mtk = new Matematika();
	Random rand = new Random();
	double a = rand.nextDouble();
	double b = rand.nextDouble();
	
	@Test(priority = 1)
	public void tesJumlah() {
		System.out.println("====================================================");
		System.out.println("TES PENJUMLAHAN");
		AssertJUnit.assertEquals(mtk.jumlahActual(a, b), mtk.jumlahExpect(a, b));
		System.out.println("====================================================");
	}
	
	@Test(priority = 2)
	public void tesKurang() {
		System.out.println("====================================================");
		System.out.println("TES PENGURANGAN");
		AssertJUnit.assertEquals(mtk.kurangActual(a, b), mtk.kurangExpect(a, b));
		System.out.println("====================================================");
	}
	
	@Test(priority = 3)
	public void tesBagi() {
		System.out.println("====================================================");
		System.out.println("TES PEMBAGIAN");
		AssertJUnit.assertEquals(mtk.bagiActual(a, b), mtk.bagiExpect(a, b));
		System.out.println("====================================================");
	}
	
	@Test(priority = 4)
	public void tesModulus() {
		System.out.println("====================================================");
		System.out.println("TES MODULUS");
		AssertJUnit.assertEquals(mtk.modulusActual(a, b), mtk.modulusExpect(a, b));
		System.out.println("====================================================");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("**TEST ARITMATIKA DIMULAI**");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("**TEST ARITMATIKA SELESAI** \n");
	}
}
