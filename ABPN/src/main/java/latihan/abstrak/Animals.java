package latihan.abstrak;

public abstract class Animals {
	private String nama;
	
	public Animals(String name) {
		this.nama = name;
	}
	
	public void setNama(String name) {
		this.nama = name;
	}
	
	public String getNama() {
		return nama;
	}
	
	public abstract void suara();
}
