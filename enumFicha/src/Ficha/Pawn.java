package Ficha;

import java.util.ArrayList;

public class Pawn extends Ficha {
	public Pawn(Tablero tablero, Ficha.Color color) {
		this.tablero = tablero;
		
		if (color == Ficha.Color.Blanco) {

			this.shape = Ficha.Shape.White_Pawn;
		} else
			this.shape = Ficha.Shape.Black_Pawn;
	}


	public ArrayList<Coordenada> getNextMovements() {
		
		ArrayList<Coordenada> nextMovements = new ArrayList<Coordenada>();
		
		Coordenada c = nuevaCoordenada.up().up();
		if ((tablero.isInside(c) && tablero.getFicha(c) == null) && validarMovimiento(c) ) {
			nextMovements.add(c);

		}

		return nextMovements;
	}
}