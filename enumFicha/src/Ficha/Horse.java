package Ficha;

import java.util.ArrayList;

public class Horse extends Ficha {

	public Horse(Tablero tablero, Ficha.Color color) {
		this.tablero = tablero;
		if (color == Ficha.Color.Blanco) {

			this.shape = Ficha.Shape.White_Horse;
		} else
			this.shape = Ficha.Shape.Black_Horse;

	}

//	public Coordenada[] movementHorse(Coordenada coordenada) {
//		Coordenada[] Horse = new Coordenada[] { coordenada.up().up().right(), coordenada.up().up().left(),
//				coordenada.down().down().right(), coordenada.down().down().left(), coordenada.left().left().up(),
//				coordenada.left().left().down(), coordenada.right().right().up(), coordenada.right().right().down() };
//		validarMovimiento();
//		return Horse;
//	}

	public ArrayList<Coordenada> getNextMovements() {

		ArrayList<Coordenada> nextMovements = new ArrayList<Coordenada>();

		Coordenada c = nuevaCoordenada.up().up().right();

		if ((tablero.isInside(c) && tablero.getFicha(c) == null) && validarMovimiento(c)) {
			nextMovements.add(c);

		}

		c = nuevaCoordenada.up().up().left();
		if ((tablero.isInside(c) && tablero.getFicha(c) == null) && validarMovimiento(c)) {
			nextMovements.add(c);

		}

		c = nuevaCoordenada.down().down().right();
		if ((tablero.isInside(c) && tablero.getFicha(c) == null) && validarMovimiento(c)) {
			nextMovements.add(c);

		}
		c = nuevaCoordenada.down().down().left();
		if ((tablero.isInside(c) && tablero.getFicha(c) == null) && validarMovimiento(c)) {
			nextMovements.add(c);

		}
		c = nuevaCoordenada.left().left().up();
		if ((tablero.isInside(c) && tablero.getFicha(c) == null) && validarMovimiento(c)) {
			nextMovements.add(c);

		}
		c = nuevaCoordenada.left().left().down();
		if ((tablero.isInside(c) && tablero.getFicha(c) == null) && validarMovimiento(c)) {
			nextMovements.add(c);

		}
		c = nuevaCoordenada.right().right().up();
		if ((tablero.isInside(c) && tablero.getFicha(c) == null) && validarMovimiento(c)) {
			nextMovements.add(c);

		}
		c = nuevaCoordenada.right().right().down();
		if ((tablero.isInside(c) && tablero.getFicha(c) == null) && validarMovimiento(c)) {
			nextMovements.add(c);

		}

		return nextMovements;
	}

}
