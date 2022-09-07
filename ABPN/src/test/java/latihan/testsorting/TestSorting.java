package latihan.testsorting;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import latihan.sorting.Sorting;

import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import static org.testng.Assert.*;
import org.testng.annotations.*;
import java.util.*;

public class TestSorting {
	Sorting st = new Sorting();
	Random rand = new Random();
	int[] intArr;
	int indexAwal;
	int indexAkhir;
	int jumlahData;
	
	@BeforeClass
	public void beforeClass() {
		jumlahData = rand.nextInt(10, 20);
		intArr = new int[jumlahData];
		System.out.println("**TES SORTING DIMULAI**");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("**TES SORTING SELESAI** \n");
	}
	
	@Test
	public void testSatu() {
		do {
			indexAwal = rand.nextInt(0, 100);
			indexAkhir = rand.nextInt(0, 100);
		}while(indexAkhir<indexAwal);
		for(int i=0; i<jumlahData; i++) {
			intArr[i] = rand.nextInt(indexAwal, indexAkhir);
		}
		System.out.println("====================================================");
		System.out.println("TEST SELECTION SORT AND BUBBLE SORT");
		AssertJUnit.assertEquals(st.selectionSortASCInt(intArr), st.bubbleSortASCInt(intArr));
		System.out.println("====================================================");
	}
}
