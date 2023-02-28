package test;

public class Vozilo {
	
	private Vozac Vozac;
	private String TipVozila;
	private String Boja;
	
	public Vozac getVozac() {
		return Vozac;
	}
	public void setVozac(Vozac vozac) {
		Vozac = vozac;
	}
	public String getTipVozila() {
		return TipVozila;
	}
	public void setTipVozila(String tipVozila) {
		TipVozila = tipVozila;
	}
	public String getBoja() {
		return Boja;
	}
	public void setBoja(String boja) {
		Boja = boja;
	}
	
	public double potrosnjaGoriva(double cenaPoLitru) {
		return 8*cenaPoLitru;
	}
	
	@Override
	public String toString() {
		return "Tip vozila: " +this.TipVozila + " Boja: " +this.Boja + " " + this.Vozac.toString();
	}
	public Vozilo() {
		
	}
	public Vozilo(test.Vozac vozac, String tipVozila, String boja) {
		Vozac = vozac;
		TipVozila = tipVozila;
		Boja = boja;
	}
	
}
