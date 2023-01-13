package it.epicode.w1P;

import java.util.Scanner;

public class Image extends MediaPlayer implements Luminosita{
	
	private int luminosita;

	public Image(String titolo, int luminosita) {
		super(titolo);
		this.luminosita = luminosita;
		// TODO Auto-generated constructor stub
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
	public void show() {
		System.out.printf("Titolo: " + getTitolo() + " Luminosità: ");
			for (int i = 1; i <= this.luminosita; i++) {
				System.out.printf("*");
			}
	}
	
	
	
}
