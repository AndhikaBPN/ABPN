package latihan.encap;

public class Mobil {
	String bahanBakar;
	int tahunPembuatan;
	
	Mobil(String bensin){
		this.bahanBakar = bensin;
	}
	
	void warna() {
		System.out.println("Berwarna ungu");
	}
	
	void mesin() {
		System.out.println("Mesin 1850 cc");
	}
	
	
	public void setTahunPembuatan(int tahunPembuatan) {
		this.tahunPembuatan = tahunPembuatan;
	}

	int getTahunPembuatan() {
		return tahunPembuatan;
	}
	
	String getBahanBakar() {
		return bahanBakar;
	}
	
	public static void main(String[] args) {
		Mobil mo = new Mobil("Pertamax");
		mo.setTahunPembuatan(1998);
		mo.warna();
		mo.mesin();
		
		System.out.println("Bahan bakar: " + mo.getBahanBakar());
		System.out.println("Tahun pembuatan: " + mo.getTahunPembuatan());
	}
	
}
