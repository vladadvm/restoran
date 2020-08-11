package paket;
//package paket;


public class NegaziraniSokovi extends Pice{

	Razno razno = new Razno();
	
	public NegaziraniSokovi() {
		setNaziv(generirajNaziv()); 
		setCena(generirajCena());
	}
	                          	
	@Override
	public String generirajNaziv() {
		return "Negazirani sok " + razno.randomName();
	}

	
}
