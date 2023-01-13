package it.epicode.w1P;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Video f1 = new Video("Angelo", 5, 5, 5);
//		Video f2 = new Video("Angelo2", 3, 3, 3);
//		Audio f3 = new Audio("Audio", 3, 4);
//		Image f4 = new Image("Angelo2", 3);
//		Image f5 = new Image("Angelo2", 3);

		MediaPlayer[] files = {  };
		
		MediaPlayer f1 = null;
		MediaPlayer f2 = null;
		MediaPlayer f3 = null;
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Seleziona tipo file: 1)Immagine, 2)Video, 3)Audio");
		int tipo = scanner1.nextInt();
		switch(tipo) {
		case 1:
			Scanner scanner = new Scanner(System.in);
			System.out.println("Titolo immagine: ");
			String titolo = scanner.nextLine();
			
			System.out.println("Luminosità immagine: ");
			int luminosita = scanner.nextInt();
			
			f1 = new Image(titolo, luminosita);
			scanner.close();
			break;
		case 2:
			Scanner scanner11 = new Scanner(System.in);
			System.out.println("Titolo video: ");
			String titolo1 = scanner11.nextLine();
			
			System.out.println("durata immagine: ");
			int durata1 = scanner11.nextInt();
			
			System.out.println("Luminosità video: ");
			int luminosita1 = scanner11.nextInt();
			
			System.out.println("Volume video: ");
			int volume1 = scanner11.nextInt();
			
			f2 = new Video(titolo1, durata1, luminosita1, volume1);
			break;
		case 3: 
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("Titolo video: ");
			String titolo2 = scanner2.nextLine();
			
			System.out.println("durata immagine: ");
			int durata2 = scanner2.nextInt();
			
			System.out.println("Volume video: ");
			int volume2 = scanner2.nextInt();
			
			f3 = new Audio(titolo2, durata2, volume2);
			break;
			
		}

		Scanner scanner = new Scanner(System.in);

		int scelta;
		do {
			System.out.println();
			System.out.println("Scrivi un numero da 1 a 5 per selezionare il file");
			scelta = scanner.nextInt();
			switch (scelta) {
			case 1:
				f1.show();
				break;
			case 2:
				f2.play();
				break;
			case 3:
				f3.play();
				break;
			case 4:
				
				break;
			case 5:
				
				break;
				default: System.out.println("Questo file non esiste! scegliere da 1 a 5");;
			}
		} while (scelta != 0);
		
	}
	
//	public static void scanner() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Titolo immagine: ");
//		String titolo = scanner.nextLine();
//		
//		System.out.println("Luminosità immagine: ");
//		int luminosita = scanner.nextInt();
//		
//		Image f1 = new Image(titolo, luminosita);
//		
//	}

}
