/**
 * 
 */
package it.epicode.be;

/**
 * @author angelomidolo
 *
 */
public class Esercizio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(perimetroR(10.60, 5.30));
		System.out.println(pariDispari(55));

	}
	
	static double perimetroR(double a, double b) {
		return (a + b) * 2;
	}
	
	static int pariDispari(int a) {
		return a % 2;
	}
	
	static double perimetroT() {
		return 5.6;
	}

}
