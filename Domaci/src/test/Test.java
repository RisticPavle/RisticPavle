package test;

public class Test {

	public static void main(String[] args) {
		Vozac v1 = new Vozac("Janko","Milosevic",551);
		System.out.println(v1.toString());
		//Vozac v2 = new Vozac();
		Vozilo auto1 = new Vozilo(v1,"Automobil","Plava");
		System.out.println(auto1.toString());
		//Vozilo auto2 = new Vozilo();
	}

}
