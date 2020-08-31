package Model;

import java.awt.Point;
import java.util.Random;

public class Spiel {
	private char[][] board = new char[3][3];
	private int anzahlZuege;
	private Spieler[] spieler;
	private Spieler aktuellerSpieler;
	
	public Spiel() {
		spieler[0] = new Spieler("x");
		spieler[1] = new Spieler("o");
		if(new Random().nextBoolean()) {
			
			setBoard();
		}
		
	}

	public Spieler[] getSpieler() {
		return spieler;
	}

	public int getAnzahlZuege() {
		return anzahlZuege;
	}

	public char[][] getBoard() {
		return board;
	}

	public void setBoard() {
		this.board = board;
	}

	public void setSpieler(Spieler[] spieler) {
		this.spieler = spieler;
	}
	
	public boolean setzen(Point p, char sp) {
		return false;
	}
	
	public char pruefen(Point p) {
		return 0;
		
	}
	
	public void nextSpieler() {
		
	}
	

}
