package ujian.ujiankedua;

public class ParseToNum {
	public int parseIntActual(String a) {
		Integer hasilInt = Integer.valueOf(a);
		System.out.println(hasilInt+" => INI parseIntActual");
		return hasilInt;
	}
	
	public int parseIntExpect(String a) {
		Integer hasilInt = Integer.parseInt(a);
		System.out.println(hasilInt+" => INI parseIntExpect");
		return hasilInt;
	}
	
	public double parseDoubleActual(String a) {
		Double hasilDouble = Double.valueOf(a);
		System.out.println(hasilDouble+" => INI parseDoubleActual");
		return hasilDouble;
	}
	
	public double parseDoubleExpect(String a) {
		Double hasilDouble = Double.parseDouble(a);
		System.out.println(hasilDouble+" => INI parseDoubleExpect");
		return hasilDouble;
	}
}
