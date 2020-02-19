package Ficha;

import java.util.ArrayList;

public class Queen extends Ficha {
	public Queen(Tablero tablero, Ficha.Color color) {
		this.tablero = tablero;
		if (color == Ficha.Color.Blanco) {

			this.shape = Ficha.Shape.White_Queen;
		} else
			this.shape = Ficha.Shape.Black_Queen;
	}

//		public Coordenada[] movementQueen(Coordenada coordenada) {
//			Coordenada[] Queen = new Coordenada[] { coordenada.up(), coordenada.down(), coordenada.left(),
//					coordenada.right(), coordenada.crossUpRigth(), coordenada.crossUpLeft(), coordenada.crossDownRight(),
//					coordenada.crossDownLeft() };
//			validarMovimiento();
//			return Queen;
//
//		}

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
		c = nuevaCoordenada.crossUpRigth();
		while ((tablero.isInside(c) && tablero.getFicha(c) == null) && validarMovimiento(c)) {
			nextMovements.add(c);
		}
		c = nuevaCoordenada.crossUpLeft();
		while ((tablero.isInside(c) && tablero.getFicha(c) == null) && validarMovimiento(c)) {
			nextMovements.add(c);

		}
		c = nuevaCoordenada.crossDownRight();
		while ((tablero.isInside(c) && tablero.getFicha(c) == null) && validarMovimiento(c)) {
			nextMovements.add(c);

		}
		c = nuevaCoordenada.crossDownLeft();
		while ((tablero.isInside(c) && tablero.getFicha(c) == null) && validarMovimiento(c)) {
			nextMovements.add(c);
		}
		return nextMovements;
	}

}
