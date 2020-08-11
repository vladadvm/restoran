package paket;



import java.util.List;

public class Porudzbina {

	private List<Artikal> sviArtikli;
	
	public Porudzbina(List<Artikal> sviArtikli)
	{
		this.sviArtikli = sviArtikli;
	}
	
	public double ukupnaCena() {
		int i;
		double ukupnaCenaRezultat = 0;
		for(i = 0; i < sviArtikli.size(); i++)
		{
			ukupnaCenaRezultat += sviArtikli.get(i).getCena();
		}
		return ukupnaCenaRezultat;
	}

	public List<Artikal> getSviArtikli() {
		return sviArtikli;
	}

	public void setSviArtikli(List<Artikal> sviArtikli) {
		this.sviArtikli = sviArtikli;
	}
	
	
	
}
