package latihan.random;
import java.util.Random;

public class AngkaRandom {
	public static void main(String[] args) {
		Random rand = new Random();
		
		for(int i=0; i<15; i++) {
			if(rand.nextInt(5, 11) == 5) {
				System.out.println("angka "+ 5 + " ketemu di index ke - " + i);
			}
		}
	}
}
