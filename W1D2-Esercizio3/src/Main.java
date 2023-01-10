
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c1 = new Cliente("1234", "Mario Rossi", "mario@rossi.com", "12/12/22");
		c1.datiCliente();
		
		System.out.println();
		
		Articolo a1 = new Articolo("A127B", "Tastiera", 15.99, 5);
		a1.dettagliArticolo();
		
		System.out.println();
		
		String[] cart = {"Tastiera", "Mouse", "iPhone", "iPad"};
		
		Carrello cart1 = new Carrello("Mario Rossi", cart, 3569.99);
		cart1.dettagliCarrello();
	}

}
