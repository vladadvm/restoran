package paket;


public class Prilozi extends Artikal{

	Razno razno = new Razno();
	
	public Prilozi() {
		this.setNaziv(generirajNaziv()); 
		this.setCena(generirajCena());
	}
	
	
	@Override
	public String generirajNaziv() {
		return razno.randomName();
	}

	@Override
	public double generirajCena() {
		int min = 20;
		int max = 100;
		double randomPrice = Math.random() * (max - min + 1) + min; 
	      return randomPrice;
	}

	
	
}
