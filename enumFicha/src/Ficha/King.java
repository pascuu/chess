package Ficha;

import java.util.ArrayList;

public class King extends Ficha {
	public King(Tablero tablero, Ficha.Color color) {
		this.tablero = tablero;
		if (color == Ficha.Color.Blanco) {

			this.shape = Ficha.Shape.White_King;
		} else
			this.shape = Ficha.Shape.Black_King;
	}

//	public Coordenada[] movementKing(Coordenada coordenada) {
//		Coordenada[] King = new Coordenada[] { coordenada.up(), coordenada.down(), coordenada.left(),
//				coordenada.right(), coordenada.crossUpRigth(), coordenada.crossUpLeft(), coordenada.crossDownRight(),
//				coordenada.crossDownLeft() };
//		validarMovimiento();
//		return King;
//
//	}

	public ArrayList<Coordenada> getNextMovements() {
		ArrayList<Coordenada> nextMovements = new ArrayList<Coordenada>();

		Coordenada c = nuevaCoordenada.up();

		if ((tablero.isInside(c) && tablero.getFicha(c) == null) && validarMovimiento(c)) {
			nextMovements.add(c);

		}
		c = nuevaCoordenada.down();
		if ((tablero.isInside(c) && tablero.getFicha(c) == null) && validarMovimiento(c)) {
			nextMovements.add(c);

		}
		c = nuevaCoordenada.left();
		if ((tablero.isInside(c) && tablero.getFicha(c) == null) && validarMovimiento(c)) {
			nextMovements.add(c);

		}
		c = nuevaCoordenada.right();
		if ((tablero.isInside(c) && tablero.getFicha(c) == null) && validarMovimiento(c)) {
			nextMovements.add(c);

		}c=nuevaCoordenada.crossUpRigth();
		if ((tablero.isInside(c) && tablero.getFicha(c) == null) && validarMovimiento(c)) {
			nextMovements.add(c);

		}
		c = nuevaCoordenada.crossUpLeft();
		if ((tablero.isInside(c) && tablero.getFicha(c) == null) && validarMovimiento(c)) {
			nextMovements.add(c);

		}
		c = nuevaCoordenada.crossDownRight();
		if ((tablero.isInside(c) && tablero.getFicha(c) == null) && validarMovimiento(c)) {
			nextMovements.add(c);

		}
		c = nuevaCoordenada.crossDownLeft();
		if ((tablero.isInside(c) && tablero.getFicha(c) == null) && validarMovimiento(c)) {
			nextMovements.add(c);

		}
		return nextMovements;
	}

}
