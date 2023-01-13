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
		MediaPlayer f4 = null;
		MediaPlayer f5 = null;
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Seleziona tipo del file 1/5: 1)Immagine, 2)Video, 3)Audio");
		int tipo = scanner1.nextInt();
		switch(tipo) {
		case 1:
			Scanner scanner = new Scanner(System.in);
			System.out.println("Titolo immagine: ");
			String titolo = scanner.nextLine();
			
			System.out.println("Luminosità immagine: ");
			int luminosita = scanner.nextInt();
			
			f1 = new Image(titolo, luminosita);
			f1.isImage = 1;
			break;
		case 2:
			Scanner scanner11 = new Scanner(System.in);
			System.out.println("Titolo video: ");
			String titolo1 = scanner11.nextLine();
			
			System.out.println("durata video: ");
			int durata1 = scanner11.nextInt();
			
			System.out.println("Luminosità video: ");
			int luminosita1 = scanner11.nextInt();
			
			System.out.println("Volume video: ");
			int volume1 = scanner11.nextInt();
			
			f1 = new Video(titolo1, durata1, luminosita1, volume1);
			f1.isImage = 0;
			break;
		case 3: 
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("Titolo audio: ");
			String titolo2 = scanner2.nextLine();
			
			System.out.println("durata audio: ");
			int durata2 = scanner2.nextInt();
			
			System.out.println("Volume audio: ");
			int volume2 = scanner2.nextInt();
			
			f1 = new Audio(titolo2, durata2, volume2);
			f1.isImage = 0;
			break;
			
		}
		
		//f2---------------------------------------------
		
		System.out.println("Seleziona tipo del file 2/5: 1)Immagine, 2)Video, 3)Audio ");
		tipo = scanner1.nextInt();
		switch(tipo) {
		case 1:
			Scanner scanner = new Scanner(System.in);
			System.out.println("Titolo immagine: ");
			String titolo = scanner.nextLine();
			
			System.out.println("Luminosità immagine: ");
			int luminosita = scanner.nextInt();
			
			f2 = new Image(titolo, luminosita);
			f2.isImage = 1;
			break;
		case 2:
			Scanner scanner11 = new Scanner(System.in);
			System.out.println("Titolo video: ");
			String titolo1 = scanner11.nextLine();
			
			System.out.println("durata video: ");
			int durata1 = scanner11.nextInt();
			
			System.out.println("Luminosità video: ");
			int luminosita1 = scanner11.nextInt();
			
			System.out.println("Volume video: ");
			int volume1 = scanner11.nextInt();
			
			f2 = new Video(titolo1, durata1, luminosita1, volume1);
			f2.isImage = 0;
			break;
		case 3: 
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("Titolo audio: ");
			String titolo2 = scanner2.nextLine();
			
			System.out.println("durata audio: ");
			int durata2 = scanner2.nextInt();
			
			System.out.println("Volume audio: ");
			int volume2 = scanner2.nextInt();
			
			f2 = new Audio(titolo2, durata2, volume2);
			f2.isImage = 0;
			break;
			
		}
		
		//f3---------------------------------------------
		System.out.println("Seleziona tipo del file 3/5: 1)Immagine, 2)Video, 3)Audio");
		tipo = scanner1.nextInt();
				switch(tipo) {
				case 1:
					Scanner scanner = new Scanner(System.in);
					System.out.println("Titolo immagine: ");
					String titolo = scanner.nextLine();
					
					System.out.println("Luminosità immagine: ");
					int luminosita = scanner.nextInt();
					
					f3 = new Image(titolo, luminosita);
					f3.isImage = 1;
					break;
				case 2:
					Scanner scanner11 = new Scanner(System.in);
					System.out.println("Titolo video: ");
					String titolo1 = scanner11.nextLine();
					
					System.out.println("durata video: ");
					int durata1 = scanner11.nextInt();
					
					System.out.println("Luminosità video: ");
					int luminosita1 = scanner11.nextInt();
					
					System.out.println("Volume video: ");
					int volume1 = scanner11.nextInt();
					
					f3 = new Video(titolo1, durata1, luminosita1, volume1);
					f3.isImage = 0;
					break;
				case 3: 
					Scanner scanner2 = new Scanner(System.in);
					System.out.println("Titolo audio: ");
					String titolo2 = scanner2.nextLine();
					
					System.out.println("durata audio: ");
					int durata2 = scanner2.nextInt();
					
					System.out.println("Volume audio: ");
					int volume2 = scanner2.nextInt();
					
					f3 = new Audio(titolo2, durata2, volume2);
					f3.isImage = 0;
					break;
					
				}
				
				
				//f4---------------------------------------------
				System.out.println("Seleziona tipo del file 4/5: 1)Immagine, 2)Video, 3)Audio");
				tipo = scanner1.nextInt();
				switch(tipo) {
				case 1:
					Scanner scanner = new Scanner(System.in);
					System.out.println("Titolo immagine: ");
					String titolo = scanner.nextLine();
					
					System.out.println("Luminosità immagine: ");
					int luminosita = scanner.nextInt();
					
					f4 = new Image(titolo, luminosita);
					f4.isImage = 1;
					break;
				case 2:
					Scanner scanner11 = new Scanner(System.in);
					System.out.println("Titolo video: ");
					String titolo1 = scanner11.nextLine();
					
					System.out.println("durata video: ");
					int durata1 = scanner11.nextInt();
					
					System.out.println("Luminosità video: ");
					int luminosita1 = scanner11.nextInt();
					
					System.out.println("Volume video: ");
					int volume1 = scanner11.nextInt();
					
					f4 = new Video(titolo1, durata1, luminosita1, volume1);
					f4.isImage = 0;
					break;
				case 3: 
					Scanner scanner2 = new Scanner(System.in);
					System.out.println("Titolo audio: ");
					String titolo2 = scanner2.nextLine();
					
					System.out.println("durata audio: ");
					int durata2 = scanner2.nextInt();
					
					System.out.println("Volume audio: ");
					int volume2 = scanner2.nextInt();
					
					f4 = new Audio(titolo2, durata2, volume2);
					f4.isImage = 0;
					break;
					
				}
				
				
				
				//f5---------------------------------------------
				System.out.println("Seleziona tipo del file 5/5: 1)Immagine, 2)Video, 3)Audio");
				tipo = scanner1.nextInt();
				switch(tipo) {
				case 1:
					Scanner scanner = new Scanner(System.in);
					System.out.println("Titolo immagine: ");
					String titolo = scanner.nextLine();
					
					System.out.println("Luminosità immagine: ");
					int luminosita = scanner.nextInt();
					
					f5 = new Image(titolo, luminosita);
					f5.isImage = 1;
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
					
					f5 = new Video(titolo1, durata1, luminosita1, volume1);
					f5.isImage = 0;
					break;
				case 3: 
					Scanner scanner2 = new Scanner(System.in);
					System.out.println("Titolo video: ");
					String titolo2 = scanner2.nextLine();
					
					System.out.println("durata immagine: ");
					int durata2 = scanner2.nextInt();
					
					System.out.println("Volume video: ");
					int volume2 = scanner2.nextInt();
					
					f5 = new Audio(titolo2, durata2, volume2);
					f5.isImage = 0;
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
				switch(f1.isImage) {
				case 1:
					f1.show();
					break;
				case 0: 
					f1.play();
					break;
				}
				break;
			case 2:
				switch(f2.isImage) {
				case 1:
					f2.show();
					break;
				case 0: 
					f2.play();
					break;
				}
				break;
			case 3:
				switch(f3.isImage) {
				case 1:
					f3.show();
					break;
				case 0: 
					f3.play();
					break;
				}
				break;
			case 4:
				switch(f4.isImage) {
				case 1:
					f4.show();
					break;
				case 0: 
					f4.play();
					break;
				}
				break;
			case 5:
				switch(f5.isImage) {
				case 1:
					f5.show();
					break;
				case 0: 
					f5.play();
					break;
				}
				break;
				default: System.out.println("Questo file non esiste! scegliere da 1 a 5");;
			}
		} while (scelta != 0);
		
	}

}
