package ujian.ujiankelima.jf;

import java.util.Random;

public class DynamicData {	
	static Random rd = new Random();
	
	public static void main(String[] args) {
		int total = rd.nextInt(10, 30);
		int awal = 0;
		int akhir = 0;
		
		do {
			awal = rd.nextInt(1, 1000);
			akhir = rd.nextInt(1, 1000);
		}while(awal>akhir);
		
		System.out.println("SOAL NOMOR 1");
		System.out.println("=======================");
		System.out.println("Random Integer");
		System.out.println("=======================");
		intRandom(total, awal, akhir);
		System.out.println("=======================\n");
		
		System.out.println("=======================");
		System.out.println("Random Double");
		System.out.println("=======================");
		doubRandom(total, awal, akhir);
		System.out.println("=======================\n");
	}
	
	
	public static void intRandom(int jumlahData, int indexAwal, int indexAkhir) {
		System.out.println("Jumlah Data: " + jumlahData);
		for(int i=0; i<jumlahData; i++) {
			int intRand = rd.nextInt(indexAwal, indexAkhir);
			System.out.println("-----------------------------------------");
			System.out.println("Data ke - " +i+ " = " + intRand);
		}
	}
	
	public static void doubRandom(int jumlahData, int indexAwal, int indexAkhir) {
		System.out.println("Jumlah Data: " + jumlahData);
		for(int i=0; i<jumlahData; i++) {
			double intRand = rd.nextDouble(indexAwal, indexAkhir);
			System.out.println("-----------------------------------------");
			System.out.println("Data ke - " +i+ " = " + intRand);
		}
	}
}
