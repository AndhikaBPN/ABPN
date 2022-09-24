package ujian.ujiankelima.testng;

public class StringtoNum {
	public String parseIntActual(String a) {
		Integer hasilInt=0;
		try {
			hasilInt = Integer.parseInt(a);
		} catch (Exception e) {
			System.out.println(hasilInt+" => INI BUKAN NUMERIC");
		}
		System.out.println(hasilInt+" => INI parseIntActual");
		return hasilInt.toString();
	}
	
	public String parseIntExpect(String a) {
		Integer hasilInt=0;
		try {
			hasilInt = Integer.valueOf(a);
		} catch (Exception e) {
			System.out.println(hasilInt+" => INI BUKAN NUMERIC");
		}
		System.out.println(hasilInt+" => INI parseIntExpect");
		return hasilInt.toString();
	}
	
	public String parseDoubleActual(String a) {
		Double hasilDouble=0.0;
		try {
			hasilDouble = Double.parseDouble(a);
		} catch (Exception e) {
			System.out.println(hasilDouble+" => INI BUKAN NUMERIC");
		}
		System.out.println(hasilDouble+" => INI parseDoubleActual");
		return hasilDouble.toString();
	}
	
	public String parseDoubleExpect(String a) {
		Double hasilDouble=0.0;
		try {
			hasilDouble = Double.valueOf(a);
		} catch (Exception e) {
			System.out.println(hasilDouble+" => INI BUKAN NUMERIC");
		}
		System.out.println(hasilDouble+" => INI parseDoubleExpect");
		return hasilDouble.toString();
	}
}
