package ujian.ujiankelima.jf;

import java.util.Random;
import java.util.Scanner;

public class MathMethod {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		boolean isRun = true;
		String strAnswer = "";
		String strInput = "";
		System.out.println("SOAL NOMOR 3");
		System.out.println("=======================");
		System.out.println("PROGRAM IS RUNNING");
		
		do {
			try {
				System.out.print("Masukkan nilai: ");
				strInput = sc.nextLine();
				Double doubInput = Double.parseDouble(strInput);
				System.out.println("=======================");
				System.out.println("Value yang Di input: " +doubInput+ "\n");
				System.out.println("Math abs = "+Math.abs(doubInput));
				System.out.println("Math ceil = "+Math.ceil(doubInput));
				System.out.println("Math exp = "+Math.exp(doubInput));
				System.out.println("Math sqrt = "+Math.sqrt(doubInput));
				System.out.println("Math round = "+Math.round(doubInput));
				System.out.println("=======================");
				System.out.print("Ingin mengulang(y/n): ");
				strAnswer = sc.nextLine();
				System.out.println();
			} catch (NumberFormatException e) {
				System.out.println(e);
			}
		}while(strAnswer.equalsIgnoreCase("y"));
		
		System.out.println("PROGRAM STOP");
	}
}
