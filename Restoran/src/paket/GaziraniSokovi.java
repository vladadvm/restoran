package paket;
//package paket;

public class GaziraniSokovi extends Pice{

	Razno razno = new Razno();
	
	public GaziraniSokovi() {
		setNaziv(generirajNaziv()); 
		setCena(generirajCena());
	}
	
	
	@Override
	public String generirajNaziv() {
		return "Gazirani sok " + razno.randomName();
	}

	
}
