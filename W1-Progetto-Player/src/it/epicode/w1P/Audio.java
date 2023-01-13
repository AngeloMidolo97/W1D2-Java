package it.epicode.w1P;

public class Audio extends MediaPlayer implements Volume{
	
	int volume;
	
	//COSTRUTTORE 
	public Audio(String titolo, int durata, int volume) {
		super(titolo, durata);
		this.volume = volume;
		// TODO Auto-generated constructor stub
	}

	//GETTER
	@Override
	public int getVolume() {
		if(volume < 0) {
			//SE IL VOLUME HA VALORE NEGATIVO SI IMPOSTA A 0
			this.volume = 0;
			System.out.println("Errore il volume non può essere minore di 0");
		}
		return volume;
	}

	
	//METODO CHE ALZA IL VOLUME
	@Override
	public int alzaVolume() {
		return ++volume;
	}
	
	//METODO CHE ABBASSA IL VOLUME
	@Override
	public int abbassaVolume() {
		return --volume;
	}
	
	//METODO PLAY CHE STAMPA TITOLO E VOLUME
	@Override
	public void play() {
		if (getDurata() > 0) {
			for (int i = 1; i <= this.getDurata(); i++) {
				System.out.printf(" Titolo: " + getTitolo() + ", Minuti: " + i);
				System.out.printf(" Volume: ");
				for (int j = 0; j < this.getVolume(); j++) {
					System.out.printf("!");
				}
				System.out.println();
			}
		}else
		System.out.println("ERRORE LA DURATA E' MINORE DI 0");
	}


}
