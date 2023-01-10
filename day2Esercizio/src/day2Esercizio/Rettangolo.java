package day2Esercizio;

public class Rettangolo {
	
	double altezza;
	double larghezza;
	
	public Rettangolo(double altezza, double larghezza) {
		
		this.altezza = altezza;
		this.larghezza = larghezza;
		
	}
	
	public double area() {
		return this.larghezza * this.altezza;
	}
	
	public double perimetro() {
		return (this.larghezza * 2) + (this.altezza * 2);
	}
	
	public void stampaRettangolo() {
		System.out.println("Area: " + this.area());
		System.out.println("Perimetro: " + this.perimetro());
	}

}
