
public class Articolo {
	String codiceArticolo;
	String descrizione;
	double prezzo;
	int pezziDisponibili;
	
	public Articolo(String codiceArticolo, String descrizione, double prezzo, int pezziDisponibili) {
		this.codiceArticolo = codiceArticolo;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.pezziDisponibili = pezziDisponibili;
	}
	
	public void dettagliArticolo() {
		System.out.println("Codice Articolo: " + codiceArticolo);
		System.out.println("Descrizione: " + descrizione);
		System.out.println("Prezzo: " + prezzo);
		System.out.println("Pezzi Disponibili: " + pezziDisponibili);
	}
}
