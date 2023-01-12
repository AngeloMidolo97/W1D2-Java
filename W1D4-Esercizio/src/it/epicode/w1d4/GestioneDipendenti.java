package it.epicode.w1d4;

public class GestioneDipendenti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dipendente d1 = new Dipendente("1234A", Dipartimento.PRODUZIONE);
		Dipendente d2 = new Dipendente("1234B", Dipartimento.PRODUZIONE);
		Dipendente d3 = new Dipendente("1234C", Dipartimento.AMMINISTRAZIONE);
		d3.promuovi();
		Dipendente d4 = new Dipendente("1234D", Dipartimento.VENDITE);
		d4.promuovi();
		d4.promuovi();
		d4.promuovi();
		
		System.out.println("Dipendente 1: " + d1.getLivello() + " Dipendente 2: " + d2.getLivello() + " Dipendente 3: " + d3.getLivello() + " Dipendente 4: " + d4.getLivello());
		
		d2.promuovi();
		d3.promuovi();
		
		System.out.println("Livello dopo le promozioni: Dipendente 1: " + d1.getLivello() + " Dipendente 2: " + d2.getLivello() + " Dipendente 3: " + d3.getLivello() + " Dipendente 4: " + d4.getLivello());
		
		System.out.println(d1.getStipendio() + Dipendente.calcolaPagaStraordinario(d1, 5) + d2.getStipendio() + Dipendente.calcolaPagaStraordinario(d2, 5) + d3.getStipendio() + Dipendente.calcolaPagaStraordinario(d3, 5) + d4.getStipendio() + Dipendente.calcolaPagaStraordinario(d4, 5));
		
	}

}
