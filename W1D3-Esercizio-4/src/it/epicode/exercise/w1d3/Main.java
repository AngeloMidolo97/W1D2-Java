package it.epicode.exercise.w1d3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		timer();
	}
	
	public static void timer() {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci numero: ");
		int numero = in.nextInt();
		for(int i = numero; i >= 0; i--) {
			System.out.println(i);
		}
	}

}
