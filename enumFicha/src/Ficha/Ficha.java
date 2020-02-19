package Ficha;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Ficha implements Serializable {

	public enum Color {
		Blanco, Negro;
	}

	public static enum Shape {
		White_Queen("\u2655", Color.Blanco), White_King("\u2654", Color.Blanco), White_Horse("\u2658", Color.Blanco),
		White_Rock("\u2656", Color.Blanco), White_Bishop("\u2657", Color.Blanco), White_Pawn("\u2659", Color.Blanco),
		Black_Queen("\u265B", Color.Negro), Black_King("\u265A", Color.Negro), Black_Horse("\u265E", Color.Negro),
		Black_Rock("\u265C", Color.Negro), Black_Bishop("\u265D", Color.Negro), Black_Pawn("\u265F", Color.Negro);

		private String forma;
		private Color color;

		Shape(String forma, Color color) {

			this.forma = forma;
			this.color = color;
		}

		public String toString() {
			return forma + "";

		}

		public Color getColor() {
			return color;
		}

	}

	protected Shape shape;
	protected Tablero tablero;
	protected Coordenada coordenada;
	protected Coordenada nuevaCoordenada;

	public Ficha() {

	}

	public String toString() {
		return "" + shape;
	}
	public abstract ArrayList<Coordenada> getNextMovements();
	
	public boolean validarMovimiento(Coordenada c) {
		
		if (!tablero.isInside(c)) {
			return false;
		}
		if (tablero.getCelda(c).getFicha() == null) {
			return true;
		} else if (tablero.getCelda(c).getFicha().shape.getColor() == this.shape.color) {
			return false;
		} else 
			return true;
		
	}
	public void remove(Coordenada c) {
		if(tablero.getCelda(c).getFicha().shape.getColor()!=this.shape.color) {
			tablero.getCelda(c).setFicha(this);
		}
	}
	public void moveTo(Coordenada c, Coordenada c2){
		
		if(this.tablero.getFicha(c).getNextMovements().contains(c2)) {
			
			this.tablero.getCelda(c2).setFicha(this);
		
	
		}
	
	}

}
