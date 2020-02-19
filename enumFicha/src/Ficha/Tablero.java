package Ficha;

public class Tablero {
	public Coordenada coordenada;
	Celda[][] celdas = new Celda[8][8];

	public Tablero() {
		for (int x = 0; x < celdas.length; x++) {
			for (int y = 0; y < celdas.length; y++) {

				celdas[x][y] = new Celda();

			}

		}
		// this.ponerPiezas();

	}

	public void ponerPiezas() {

		celdas[7][0].setFicha(new Rock(this, Ficha.Color.Negro));
		celdas[7][1].setFicha(new Horse(this, Ficha.Color.Negro));
		celdas[7][2].setFicha(new Bishop(this, Ficha.Color.Negro));
		celdas[7][3].setFicha(new Queen(this, Ficha.Color.Negro));
		celdas[7][4].setFicha(new King(this, Ficha.Color.Negro));
		celdas[7][5].setFicha(new Bishop(this, Ficha.Color.Negro));
		celdas[7][6].setFicha(new Horse(this, Ficha.Color.Negro));
		celdas[7][7].setFicha(new Rock(this, Ficha.Color.Negro));
		for (int i = 0; i < celdas.length; i++) {
			celdas[6][i].setFicha(new Pawn(this, Ficha.Color.Negro));

		}

		celdas[0][0].setFicha(new Rock(this, Ficha.Color.Blanco));
		celdas[0][1].setFicha(new Horse(this, Ficha.Color.Blanco));
		celdas[0][2].setFicha(new Bishop(this, Ficha.Color.Blanco));
		celdas[0][3].setFicha(new Queen(this, Ficha.Color.Blanco));
		celdas[0][4].setFicha(new King(this, Ficha.Color.Blanco));
		celdas[0][5].setFicha(new Bishop(this, Ficha.Color.Blanco));
		celdas[0][6].setFicha(new Horse(this, Ficha.Color.Blanco));
		celdas[0][7].setFicha(new Rock(this, Ficha.Color.Blanco));
		for (int j = 0; j < celdas.length; j++) {
			celdas[1][j].setFicha(new Pawn(this, Ficha.Color.Blanco));

		}

	}

	public String toString() {

		String tablero = "";
		tablero += "\t      A   B   C   D   E   F   G   H\n";
		tablero += "\t    ┏━━━┳━━━┳━━━┳━━━┳━━━┳━━━┳━━━┳━━━┓\n";
		tablero += "\t  8 ┃ " + celdas[7][0] + " ┃ " + celdas[7][1] + " ┃ " + celdas[7][2] + " ┃ " + celdas[7][3]
				+ " ┃ " + celdas[7][4] + " ┃ " + celdas[7][5] + " ┃ " + celdas[7][6] + " ┃ " + celdas[7][7] + " ┃ 8\n";
		tablero += "\t    ┣━━━╋━━━╋━━━╋━━━╋━━━╋━━━╋━━━╋━━━┫ \n";
		tablero += "\t  7 ┃ " + celdas[6][0] + " ┃ " + celdas[6][1] + " ┃ " + celdas[6][2] + " ┃ " + celdas[6][3]
				+ " ┃ " + celdas[6][4] + " ┃ " + celdas[6][5] + " ┃ " + celdas[6][6] + " ┃ " + celdas[6][7] + " ┃ 7\n";
		tablero += "\t    ┣━━━╋━━━╋━━━╋━━━╋━━━╋━━━╋━━━╋━━━┫\n";
		tablero += "\t  6 ┃ " + celdas[5][0] + " ┃ " + celdas[5][1] + " ┃ " + celdas[5][2] + " ┃ " + celdas[5][3]
				+ " ┃ " + celdas[5][4] + " ┃ " + celdas[5][5] + " ┃ " + celdas[5][6] + " ┃ " + celdas[5][7] + " ┃ 6\n";
		tablero += "\t    ┣━━━╋━━━╋━━━╋━━━╋━━━╋━━━╋━━━╋━━━┫\n";
		tablero += "\t  5 ┃ " + celdas[4][0] + " ┃ " + celdas[4][1] + " ┃ " + celdas[4][2] + " ┃ " + celdas[4][3]
				+ " ┃ " + celdas[4][4] + " ┃ " + celdas[4][5] + " ┃ " + celdas[4][6] + " ┃ " + celdas[4][7] + " ┃ 5\n";
		tablero += "\t    ┣━━━╋━━━╋━━━╋━━━╋━━━╋━━━╋━━━╋━━━┫\n";
		tablero += "\t  4 ┃ " + celdas[3][0] + " ┃ " + celdas[3][1] + " ┃ " + celdas[3][2] + " ┃ " + celdas[3][3]
				+ " ┃ " + celdas[3][4] + " ┃ " + celdas[3][5] + " ┃ " + celdas[3][6] + " ┃ " + celdas[3][7] + " ┃ 4\n";
		tablero += "\t    ┣━━━╋━━━╋━━━╋━━━╋━━━╋━━━╋━━━╋━━━┫\n";
		tablero += "\t  3 ┃ " + celdas[2][0] + " ┃ " + celdas[2][1] + " ┃ " + celdas[2][2] + " ┃ " + celdas[2][3]
				+ " ┃ " + celdas[2][4] + " ┃ " + celdas[2][5] + " ┃ " + celdas[2][6] + " ┃ " + celdas[2][7] + " ┃ 3\n";
		tablero += "\t    ┣━━━╋━━━╋━━━╋━━━╋━━━╋━━━╋━━━╋━━━┫\n";
		tablero += "\t  2 ┃ " + celdas[1][0] + " ┃ " + celdas[1][1] + " ┃ " + celdas[1][2] + " ┃ " + celdas[1][3]
				+ " ┃ " + celdas[1][4] + " ┃ " + celdas[1][5] + " ┃ " + celdas[1][6] + " ┃ " + celdas[1][7] + " ┃ 2\n";
		tablero += "\t    ┣━━━╋━━━╋━━━╋━━━╋━━━╋━━━╋━━━╋━━━┫\n";
		tablero += "\t  1 ┃ " + celdas[0][0] + " ┃ " + celdas[0][1] + " ┃ " + celdas[0][2] + " ┃ " + celdas[0][3]
				+ " ┃ " + celdas[0][4] + " ┃ " + celdas[0][5] + " ┃ " + celdas[0][6] + " ┃ " + celdas[0][7] + " ┃ 1\n";
		tablero += "\t    ┗━━━┻━━━┻━━━┻━━━┻━━━┻━━━┻━━━┻━━━┛\n";
		tablero += "\t      A   B   C   D   E   F   G   H\n";

		return tablero;

	}

	public Celda[][] getCeldas() {
		return celdas;
	}

	public Celda getCelda(Coordenada c) {
		int numero=c.getNumero();
		char letra=c.getLetra();
		int letraBuena=(int)(letra-'A');
		return this.celdas[numero][letraBuena];
	}

	public void setCeldas(Celda[][] celdas) {
		this.celdas = celdas;
	}

	public boolean isInside(Coordenada c) {

		if (c.getLetra() < 'A' || c.getLetra() > 'H') {
			return false;

		} else if (c.getNumero() < 1 || c.getNumero() > 8) {
			return false;
		} else
			return true;

	}
	public Ficha getFicha(Coordenada c) {
		if(this.getCelda(c)!=null) {
			return this.getCelda(c).getFicha();
		}else 
			return null;
	}

}
