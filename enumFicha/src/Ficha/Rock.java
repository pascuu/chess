package Ficha;

import java.util.ArrayList;

public class Rock extends Ficha {

	public Rock(Tablero tablero, Ficha.Color color) {
		this.tablero = tablero;
		if (color == Ficha.Color.Blanco) {

			this.shape = Ficha.Shape.White_Rock;
		} else
			this.shape = Ficha.Shape.Black_Rock;

	}

//	public Coordenada [] movementRock(Coordenada coordenada) {
//		Coordenada[]Rock=new Coordenada[]{coordenada.up(),coordenada.down(),coordenada.left(),coordenada.right()};
//	
//			
//		
//		validarMovimiento(coordenada);
//		
//		return Rock;
//	}
//	
	public ArrayList<Coordenada> getNextMovements() {
		ArrayList<Coordenada> nextMovements = new ArrayList<Coordenada>();

		Coordenada c = nuevaCoordenada.up();

		while ((tablero.isInside(c) && tablero.getFicha(c) == null) && validarMovimiento(c)) {
			nextMovements.add(c);

		}
		c = nuevaCoordenada.down();
		while ((tablero.isInside(c) && tablero.getFicha(c) == null) && validarMovimiento(c)) {
			nextMovements.add(c);

		}
		c = nuevaCoordenada.left();
		while ((tablero.isInside(c) && tablero.getFicha(c) == null) && validarMovimiento(c)) {
			nextMovements.add(c);

		}
		c = nuevaCoordenada.right();
		while ((tablero.isInside(c) && tablero.getFicha(c) == null) && validarMovimiento(c)) {
			nextMovements.add(c);

		}
		return nextMovements;
	}

}
