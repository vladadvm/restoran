package paket;


public abstract class Pice extends Artikal{

	private double zapremina;
	
	public double getZapremina() {
		return zapremina;
	}
	public void setZapremina(double zapremina) {
		this.zapremina = zapremina;
	}
	
	@Override
	public double generirajCena() {
		int min = 150;
		int max = 500;
		double randomPrice = Math.random() * (max - min + 1) + min; 
	    return randomPrice;
	} 
	
}
