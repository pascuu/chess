package Ficha;

import java.util.ArrayList;

public class Bishop extends Ficha {

	public Bishop(Tablero tablero, Ficha.Color color) {
		this.tablero = tablero;
		if (color == Ficha.Color.Blanco) {

			this.shape = Ficha.Shape.White_Bishop;
		} else
			this.shape = Ficha.Shape.Black_Bishop;
	}

//	public Coordenada[] movementBishop(Coordenada coordenada) {
//		Coordenada[] Bishop = new Coordenada[] { coordenada.crossUpRigth(), coordenada.crossUpLeft(),
//				coordenada.crossDownRight(), coordenada.crossDownLeft()};
//		validarMovimiento();
//		return Bishop;
//
//	}

	public ArrayList<Coordenada> getNextMovements() {
		ArrayList<Coordenada> nextMovements = new ArrayList<Coordenada>();

		Coordenada c = nuevaCoordenada.crossUpRigth();

		// crossUpRigth
		while ((tablero.isInside(c) && tablero.getFicha(c) == null)&& validarMovimiento(c)) {
			nextMovements.add(c);
//			if (validarMovimiento(c)) {
//				nextMovements.add(c);
//			}
//			if(tablero.getFicha(c).shape.getColor()!=this.shape.getColor()) {
//				remove(c);
//				
//			}
		}
//		
//		if (validarMovimiento(c)) {
//			nextMovements.add(c);
//		
//				;
//		}
		c = nuevaCoordenada.crossUpLeft();
		while ((tablero.isInside(c) && tablero.getFicha(c) == null)&& validarMovimiento(c)){
			nextMovements.add(c);
//			if (validarMovimiento(c)) {
//				nextMovements.add(c);
//			}
		}
		c = nuevaCoordenada.crossDownRight();
		while ((tablero.isInside(c) && tablero.getFicha(c) == null)&& validarMovimiento(c)) {
			nextMovements.add(c);
//			if (validarMovimiento(c)) {
//				nextMovements.add(c);
//			}
		}
		c = nuevaCoordenada.crossDownLeft();
		while ((tablero.isInside(c) && tablero.getFicha(c) == null)&& validarMovimiento(c)) {
			nextMovements.add(c);
//			if (validarMovimiento(c)) {
//				nextMovements.add(c);
//			}
		}
		return nextMovements;
	}
}
