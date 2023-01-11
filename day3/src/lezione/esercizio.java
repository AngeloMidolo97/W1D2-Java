package lezione;

public class esercizio {
	
	//ALGORITMO CHE STAMPA LE TABELLINE DALL 1 AL 10

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=10; i++) {
			
			for(int f = 1; f <= 10; f++) {
				
				int moltiplicazione = i*f;
				System.out.print(moltiplicazione + " ");
				
			}
			
			System.out.println();
			
		}
	}

}
