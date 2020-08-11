package paket;


public class Voda extends Pice{

	Razno razno = new Razno();
	
	public Voda() {
		setNaziv(generirajNaziv()); 
		setCena(generirajCena());
	}
	
	@Override
	public String generirajNaziv() {
		return "Voda " + razno.randomName();
	}

	

}
