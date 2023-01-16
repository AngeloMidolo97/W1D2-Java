package it.epicode.w1d2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	static int[] array = new int[5];
	private static int a, i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array = creaArray();
		System.out.println(Arrays.toString(array));
		generaNumeri();
	}

	public static int[] creaArray() {
		int[] array = new int[5];
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(11);
		}
		return array;
	}

	private static void generaNumeri() {

		do {
			
			Scanner in = new Scanner(System.in);
			try {

				System.out.println("Inserisci un numero da 1 a 10");
				a = Integer.parseInt(in.nextLine());

				System.out.println("Dove vuoi inserire il numero? (0-4)");
				i = Integer.parseInt(in.nextLine());

			} catch (NumberFormatException e) {

				System.out.println("Errore inserire i numeri in un formato corretto! ");

			}
			try {
				array[i] = a;
			} catch (ArrayIndexOutOfBoundsException e) {

				System.out.println("La posizione non esiste!");
				System.out.println("Dove vuoi inserire il numero? (0-4)");
				i = Integer.parseInt(in.nextLine());

				array[i] = a;

			}

			System.out.println(Arrays.toString(array));

		} while (a != 0);
	}
}
