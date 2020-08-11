package paket;
//package paket;

import java.util.ArrayList;
import java.util.List;

public abstract class Obrok extends Artikal{

	private List<Prilozi> listaPriloga;
	
	public Obrok()
	{
		listaPriloga = new ArrayList<Prilozi>();
		//cenaPriloga = getUkupnaCenaPriloga();
	}
	
	
	public List<Prilozi> getListaPriloga() {
		return listaPriloga;
	}
	
	public void setListaPriloga(List<Prilozi> listaPriloga) {
		this.listaPriloga = listaPriloga;
	}
	
	public void dodajPrilog(Prilozi prilog) {
		this.listaPriloga.add(prilog);
	}

	@Override
	public double generirajCena() {
		int min = 300;
		int max = 600;
		 double randomPrice = Math.random() * (max - min + 1) + min; 
	      return randomPrice;
	}
	
	public double getUkupnaCena() {
		double cena = this.cena;
		int i;
		for(i = 0; i < listaPriloga.size(); i++) {
			cena += listaPriloga.get(i).getCena();
		}
		return cena;
	}
}
