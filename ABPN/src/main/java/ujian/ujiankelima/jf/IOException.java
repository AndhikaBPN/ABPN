package ujian.ujiankelima.jf;

import java.io.*;

public class IOException {
	public static void main(String[] args) throws java.io.IOException {
		FileInputStream input = null;
		
		System.out.println("SOAL NOMOR 2");
		System.out.println("=======================");
		
		try {
			input = new FileInputStream(".\\data\\output.xlsx");
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("FILE TIDAK DITEMUKAN !!");
		}
		System.out.println();
		System.out.println("NEXT STATEMENT");
	}
}
