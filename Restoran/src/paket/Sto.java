package paket;


public class Sto {

	private int id;
	private Porudzbina porudzbina;
	private boolean daLiJePlacenRacun;
	
	
	public Sto(int id)
	{
		this.id = id;
		porudzbina = null;
		daLiJePlacenRacun = false;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Porudzbina getPorudzbina() {
		return porudzbina;
	}

	public boolean isDaLiJePlacenRacun() {
		return daLiJePlacenRacun;
	}

	public void setDaLiJePlacenRacun(boolean daLiJePlacenRacun) {
		this.daLiJePlacenRacun = daLiJePlacenRacun;
	}

	public void novaPorudzbina(Porudzbina porudzbina) throws Exception{
		if(porudzbina != null && daLiJePlacenRacun == false)
		{
			throw new Exception("Nije mogucÌ?e izdati novu porudzÌŒbinu jer prethodna nije placÌ?ena.");
		}
			
		this.porudzbina = porudzbina;
		daLiJePlacenRacun = false;
	}
	
	public void prikaziRacun() {
		
	}
	
	public void platiRacun() {
		daLiJePlacenRacun = true;
	}
	
}
