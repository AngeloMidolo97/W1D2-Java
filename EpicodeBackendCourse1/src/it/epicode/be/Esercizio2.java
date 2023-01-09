/**
 * 
 */
package it.epicode.be;

/**
 * @author angelomidolo
 *
 */
public class Esercizio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args ) {
		// TODO Auto-generated method stub
		String[] nomi = {"Angelo", "Ciao", "Epicode", "Java", "Programming"};
		
		System.out.println(multiply( 10, 20));
		
		concat("Angelo", 5);
		
		inserisciInArray("Ciao2", nomi);

	}
	
	static int multiply(int a, int b) {
		return a * b;
	}
	
	static void concat( String name, int y) {
		System.out.println("Hello " + name + " the number is: " + y);
	}
	
	static void inserisciInArray(String a, String[] nomi) {
		String[] nomi2 = new String[6];
		nomi2[0] = nomi[0];
		nomi2[1] = nomi[1];
		nomi2[2] = a;
		nomi2[3] = nomi[2];
		nomi2[4] = nomi[3];
		nomi2[5] = nomi[4];
		System.out.println( java.util.Arrays.toString(nomi) );
		System.out.println( java.util.Arrays.toString(nomi2) );
	}

}
