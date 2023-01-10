package day2Esercizio;

public class Esercizio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rettangolo r1 = new Rettangolo(5, 10);
		Rettangolo r2 = new Rettangolo(10, 20);
		
		r1.area();
		r1.stampaRettangolo();
		
		System.out.println();
		
		r2.area();
		r2.stampaRettangolo();
		
		System.out.println();
		
		stampaDueRettangolo(r1, r2);
		
		
	}
	
	private static void stampaDueRettangolo(Rettangolo r1, Rettangolo r2) {
		System.out.println("Somma area: " + (r1.area() + r2.area()));
		System.out.println("Somma perimetro: " + (r1.perimetro() + r2.perimetro()));
	}

}
