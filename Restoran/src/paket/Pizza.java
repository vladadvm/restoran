package paket;


public class Pizza extends Obrok{

	Razno razno = new Razno();
	
	public Pizza() {
		setNaziv(generirajNaziv()); 
		setCena(generirajCena());
	}
	
	@Override
	public String generirajNaziv() {
		return "Pizza " + razno.randomName();
	}

	

	
	
}
