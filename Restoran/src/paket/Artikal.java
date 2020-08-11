package paket;
//package paket;

public abstract class Artikal {

	private String naziv;
	protected double cena;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	
	public abstract String generirajNaziv();
	public abstract double generirajCena();
	
}
