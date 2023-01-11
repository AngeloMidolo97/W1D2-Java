package it.epicode.exercise.w1d3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stampaCaratteri();
	}
	
	public static void stampaCaratteri() {
		String parola = null;
		do {
			Scanner in = new Scanner(System.in);
			System.out.println("Inserisci parola: ");
			parola = in.nextLine();
			String[] arrayStringhe = parola.split("");
			String arraySplit = null;
			
			for(int i = 0; i < arrayStringhe.length; i++) {
				arraySplit = arrayStringhe[i];
				System.out.println(arraySplit);
			}
			
			
		} while (!":q".equals(parola));
	}
	
}
