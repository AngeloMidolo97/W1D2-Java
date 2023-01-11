package it.epicode.exercise.w1d3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stampaLettere(3);
	}
	
	public static void stampaLettere(int n) {
		switch(n) {
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("uno");
			break;
		case 2:
			System.out.println("due");
			break;
		case 3:
			System.out.println("tre");
			break;
		default: System.out.println("ERRORE");
		}
			
	}

}
