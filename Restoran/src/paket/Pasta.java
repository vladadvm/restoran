package paket;

public class Pasta extends Obrok{

	Razno razno = new Razno();
	
	public Pasta() {
		setNaziv(generirajNaziv()); 
		setCena(generirajCena());
	}
	
	
	@Override
	public String generirajNaziv() {
		return "Pasta " + razno.randomName();
	}

	

}
