package test;

public class Kamion extends Vozilo{
	
	public Kamion() {
		
	}
	
	public Kamion(Vozac Vozac,String TipVozila,String Boja) {
		super(Vozac,TipVozila,Boja);
	}
	
	@Override
	public double potrosnjaGoriva(double cenaPoLitru) {
		return super.potrosnjaGoriva(cenaPoLitru)*2;
	}
}
