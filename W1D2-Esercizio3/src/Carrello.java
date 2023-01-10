
public class Carrello {
	String cliente;
	String[] articoli;
	double totaleCarrello;
	
	public Carrello(String cliente, String[] articoli, double totaleCarrello) {
		this.cliente = cliente;
		this.articoli = articoli;
		this.totaleCarrello = totaleCarrello;
	}
	
	public void dettagliCarrello() {
		System.out.println("Cliente: " + this.cliente);
		System.out.println("Articoli: " + java.util.Arrays.toString(this.articoli));
		System.out.println("Totale Carrello: " + this.totaleCarrello);
	}
}
