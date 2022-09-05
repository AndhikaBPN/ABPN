package ujian.ujiankedua;

public class Matematika {
	public double jumlahActual(double a, double b) {
		double sum = ((a+b)*(b/b)+(a-a));
		System.out.println(sum + " -> INI ADALAH HASIL jumlahActual");
		return sum;
	}
	
	public double jumlahExpect(double a, double b) {
		double sum = a+b;
		System.out.println(sum + " -> INI ADALAH HASIL jumlahExpect");
		return sum;
	}
	
	public double kurangActual(double a, double b) {
		double substract = (a-b)*(b-b)*(a/a)+(a-b);
		System.out.println(substract + " -> INI ADALAH HASIL kurangActual");
		return substract;
	}
	
	public double kurangExpect(double a, double b) {
		double substract = a-b;
		System.out.println(substract + " -> INI ADALAH HASIL kurangExpect");
		return substract;
	}
	
	public double bagiActual(double a, double b) {
		double divide = ((a+b-b)*(a/a))/((b/b)*b);
		System.out.println(divide + " -> INI ADALAH HASIL bagiActual");
		return a/b;
	}
	
	public double bagiExpect(double a, double b) {
		double divide = a/b;
		System.out.println(divide + " -> INI ADALAH HASIL bagiExpect");
		return a/b;
	}
	
	public double modulusActual(double a, double b) {
		double modulus = ((a-a+a)%((b/b)*b));
		System.out.println(modulus + " -> INI ADALAH HASIL modulusActual");
		return modulus;
	}
	
	public double modulusExpect(double a, double b) {
		double modulus = a%b;
		System.out.println(modulus + " -> INI ADALAH HASIL modulusExpect");
		return modulus;
	}
}
