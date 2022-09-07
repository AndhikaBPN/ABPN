package latihan.jumlahchar;
import java.util.*;

public class Remedial {
	int jumlah(int x, int y) {
		return x+y;
	}
    public static void main(String[] args) {
    	
//    	ANALISA
//    	INPUT BERUPA NUMERIC ATAU INTEGER
//    	SETIAP SETELAH INPUT NUMERIC, AKAN LANGSUNG DIJUMLAHKAN DI SUM
//    	JIKA SEKALI KITA INPUT SELAIN NUMERIC(HURUF ATAU SIMBOL) MAKA PROSES INPUT AKAN SELESAI
//    	SETELAH INPUT SELESAI(ERROR) AKAN DITANGKAP OLEH CATCH DAN AKAN PRINT HASIL SUM DAN AKAN DI BREAK
//    	SETELAH BREAK, PROSES AKAN LANGSUNG SELESAI KARENA TIDAK ADA NEXT STATEMENT
    	
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = 0;

        System.out.println("Masukkan angka sepuasnya. Jika sudah puas masukkan karakter: ");

        do {
            try {
                num = sc.nextInt();
                sum += num;
            } catch (Exception e) {
                System.out.println("Jumlah: "+sum);
                break;
            }
        } while (true);
    }
}
