package ujian.ujiankedua;

public class Geometri {
	public double luasPersegiActual(double x) {
		double intLuasPersegi = Math.pow(x, 2);
		System.out.println(intLuasPersegi + " -> INI ADALAH HASIL luasPersegiActual");
		return intLuasPersegi;
	}
	
	public double luasPersegiExpect(double x) {
		double intLuasPersegi = x*x;
		System.out.println(intLuasPersegi + " -> INI ADALAH HASIL luasPersegiExpect");
		return intLuasPersegi;
	}
	
	public double luasSegitigaActual(double x, double y) {
		double intLuasSegitiga = 0.5*x*y;
		System.out.println(intLuasSegitiga + " -> INI ADALAH HASIL luasSegitigaActual");
		return intLuasSegitiga;
	}
	
	public double luasSegitigaExpect(double x, double y) {
		double intLuasSegitiga = 0.5*x*y;
		System.out.println(intLuasSegitiga + " -> INI ADALAH HASIL luasSegitigaExpect");
		return intLuasSegitiga;
	}
	
	public double luasTrapesiumActual(double x, double y, String z) {
		Double t = Double.valueOf(z);
		double intLuasTrapesium = (x+y)*t/2;
		System.out.println(intLuasTrapesium + " -> INI ADALAH HASIL luasTrapesiumActual");
		return intLuasTrapesium;
	}
	
	public double luasTrapesiumExpect(double x, double y, double z) {
//		Double t = Double.valueOf(z);
		double intLuasTrapesium = 0.5*z*(x+y);
		System.out.println(intLuasTrapesium + " -> INI ADALAH HASIL luasTrapesiumActual");
		return intLuasTrapesium;
	}
}
