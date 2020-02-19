package Ficha;

public class Celda {

	protected Ficha ficha;

	public Celda() {
	
	}

	public Ficha getFicha() {
		return ficha;
	}

	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}

	public String toString() {
		if (ficha != null)
			return "" + ficha;
		else
			return " ";
	}

}
