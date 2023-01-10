
public class Sim {
	
	String numero;
	double credito = 0;
	String[][] ultime5Chiamate;
	
	public Sim(String numero, double credito, String[][] ultime5Chiamate) {
		
		this.numero = numero;
		this.credito = credito;
		this.ultime5Chiamate = ultime5Chiamate;
		
	}
	
	public void stampaDati() {
		
		System.out.println("Numero: " + numero);
		System.out.println("Credito: " + credito);
		System.out.println("Ultime chiamate: " + java.util.Arrays.deepToString(ultime5Chiamate));
		
	}

}
