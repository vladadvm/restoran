package paket;


import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		int i;
		ArrayList<Sto> stolovi = new ArrayList<Sto>();
		ArrayList<Pizza> pice = new ArrayList<Pizza>();
		ArrayList<Pice> pica = new ArrayList<Pice>();
		ArrayList<Pasta> paste = new ArrayList<Pasta>();
		ArrayList<Prilozi> prilozi = new ArrayList<Prilozi>();
		ArrayList<Artikal> porudzbina1 = new ArrayList<Artikal>();
		ArrayList<Artikal> porudzbina2 = new ArrayList<Artikal>();
		ArrayList<Artikal> porudzbina3 = new ArrayList<Artikal>();
		ArrayList<Artikal> porudzbina4 = new ArrayList<Artikal>();
		Porudzbina instanca_porudzbina1;
		Porudzbina instanca_porudzbina2;
		Porudzbina instanca_porudzbina3;
		Porudzbina instanca_porudzbina4;
		for(i = 1; i <= 4; i++)
		{
			stolovi.add(new Sto(i));
		}
		for(i = 1; i <= 4; i++)
		{
			pice.add(new Pizza());
		}
		
		for(i = 1; i <= 5; i++)
		{
			paste.add(new Pasta());
		}
		
		pica.add(new GaziraniSokovi());
		pica.add(new NegaziraniSokovi());
		pica.add(new Voda());

		for(i = 1; i <= 5; i++)
		{
			prilozi.add(new Prilozi());
		}
		
		//porudzbina 1
		pice.get(0).dodajPrilog(prilozi.get(0));
		pice.get(0).dodajPrilog(prilozi.get(1));
		porudzbina1.add(pice.get(0));
		paste.get(0).dodajPrilog(prilozi.get(2));
		porudzbina1.add(paste.get(0));
		porudzbina1.add(pica.get(0));
		porudzbina1.add(pica.get(0));
		
		//porudzbina 2
		porudzbina2.add(pice.get(1));
		porudzbina2.add(paste.get(1));
		porudzbina2.add(pica.get(1));
		porudzbina2.add(pica.get(1));
		
		//porudzbina 3
		pice.get(2).dodajPrilog(prilozi.get(3));
		pice.get(2).dodajPrilog(prilozi.get(3));
		porudzbina3.add(pice.get(2));
		porudzbina3.add(pica.get(0));
		porudzbina3.add(pica.get(1));
		porudzbina3.add(pica.get(2));
		
		
		instanca_porudzbina1 = new Porudzbina(porudzbina1);
		try
		{
			stolovi.get(0).novaPorudzbina(instanca_porudzbina1);
			MojLog.getInstance().logKreiranjePorudžbina(stolovi.get(0).getId());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		instanca_porudzbina2 = new Porudzbina(porudzbina2);
		try
		{
			stolovi.get(1).novaPorudzbina(instanca_porudzbina2);
			MojLog.getInstance().logKreiranjePorudžbina(stolovi.get(1).getId());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		instanca_porudzbina3 = new Porudzbina(porudzbina3);
		try
		{
			stolovi.get(2).novaPorudzbina(instanca_porudzbina3);
			MojLog.getInstance().logKreiranjePorudžbina(stolovi.get(2).getId());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		stolovi.get(0).prikaziRacun();
		MojLog.getInstance().logIzdavanjeRacun(stolovi.get(0).getId(), stolovi.get(0).getPorudzbina().ukupnaCena());
		stolovi.get(0).platiRacun();
		stolovi.get(2).prikaziRacun();
		MojLog.getInstance().logIzdavanjeRacun(stolovi.get(2).getId(), stolovi.get(2).getPorudzbina().ukupnaCena());
		stolovi.get(2).platiRacun();

		porudzbina4.add(pica.get(4));
		instanca_porudzbina4 = new Porudzbina(porudzbina4);
		try
		{
			stolovi.get(1).novaPorudzbina(instanca_porudzbina2);
			MojLog.getInstance().logKreiranjePorudžbina(stolovi.get(1).getId());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		stolovi.get(1).prikaziRacun();
		MojLog.getInstance().logIzdavanjeRacun(stolovi.get(1).getId(), stolovi.get(1).getPorudzbina().ukupnaCena());
		stolovi.get(1).platiRacun();
		
		try
		{
			stolovi.get(1).novaPorudzbina(instanca_porudzbina2);
			MojLog.getInstance().logKreiranjePorudžbina(stolovi.get(1).getId());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
}
