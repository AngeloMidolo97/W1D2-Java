package it.epicode.exercise.w1d3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringaPariDispari("ciao");
		annoBisestile(2024);
	}

	static boolean pariDispari;
	static boolean stringaPariDispari(String a) {
		if(a.length() % 2 == 0) {
			System.out.println("Il numero è pari");
			return true;
		} else {
			System.out.println("Il numero è dispari");
			return false;
		}
	}

	static boolean annoBisestile(int a) {

		if(a % 4 == 0 || a % 100 == 0 && a % 400 == 0) {
			System.out.println("L'anno " + a + " è bisestile");
			return true;
		} else {
		System.out.println("L'anno " + a + " non è bisestile");
		return false;
		}
	}

}
