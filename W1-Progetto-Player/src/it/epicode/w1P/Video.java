package it.epicode.w1P;

public class Video extends MediaPlayer implements Volume, Luminosita{
	
	private int volume;
	private int luminosita;

	public Video(String titolo, int durata, int luminosita, int volume) {
		super(titolo, durata);
		this.luminosita = luminosita;
		this.volume = volume;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int alzaVolume() {
		// TODO Auto-generated method stub
		return ++volume;
	}

	@Override
	public int abbassaVolume() {
		// TODO Auto-generated method stub
		return --volume;
	}

	@Override
	public int getVolume() {
		// TODO Auto-generated method stub
		if(volume < 0) {
			//SE IL VOLUME HA VALORE NEGATIVO SI IMPOSTA A 0
			this.volume = 0;
			System.out.println("Errore il volume non può essere minore di 0");
		}
		return volume;
	}

	@Override
	public int alzaLuminosita() {
		// TODO Auto-generated method stub
		return ++luminosita;
	}

	@Override
	public int abbassaLuminosita() {
		// TODO Auto-generated method stub
		return --luminosita;
	}

	@Override
	public int getLuminosita() {
		// TODO Auto-generated method stub
		return luminosita;
	}
	
	@Override
	public void play() {
		if (getDurata() > 0) {
			for (int i = 1; i <= getDurata(); i++) {
				System.out.printf(" Titolo: " + getTitolo() + ", Minuti: " + i);
				System.out.printf(" Volume: ");
				for (int j = 0; j < this.getVolume(); j++) {
					System.out.printf("!");
				}
				System.out.printf(" Luminosità: ");
				for (int x = 1; x <= this.luminosita; x++) {
					System.out.printf("*");
				}
				System.out.println();
			}
		} else 
			System.out.println("ERRORE LA LUMINOSITA E' MINORE DI 0");
	}

}
