package paket;
//package paket;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class MojLog {
	
	private static MojLog logger = null;
	
	private final String imeFajl = "log_porudzbine.txt";
	private PrintWriter writer;
	
	public MojLog() {
		try {
			FileWriter fw = new FileWriter(imeFajl);
		    writer = new PrintWriter(fw, true);
		} catch (IOException e) {
			System.out.println("Nije moguce otvoriti log fajl.");
		}
	}
	
	public static synchronized MojLog getInstance(){
		if(logger == null)
			logger = new MojLog();
		return logger;
	}
	
	public void logKreiranjePorudžbina(int brojSto) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		LocalDateTime now = LocalDateTime.now();
		writer.println("Porudzbina: datum" + dtf.format(now) + "sto broj" + brojSto);
	}
	
	public void logIzdavanjeRacun(int brojSto, double cena) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		LocalDateTime now = LocalDateTime.now();
		writer.println("Racun: datum" + dtf.format(now) + "sto broj" + brojSto + ", naplata " + cena + "rsd");
	}

}
