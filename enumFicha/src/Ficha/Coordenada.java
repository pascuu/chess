package Ficha;

public class Coordenada {

	protected char letra;
	protected int numero;

	

	public Coordenada(int numero,char letra) {
		super();
		this.letra = letra;
		this.numero = numero;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra =letra;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero-1;
	}

	public Coordenada up() {

		return new Coordenada(this.numero+1,this.letra);
	}

	public Coordenada down() {
		return new Coordenada( this.numero-1,this.letra);
	}

	public Coordenada right() {
		return new Coordenada( this.numero,(char)(this.letra+1));
	}

	public Coordenada left() {
		return new Coordenada( this.numero,(char)(this.letra-1));
	}

	public Coordenada crossUpRigth() {
		return new Coordenada( this.numero+1,(char)(this.letra+1));
	}

	public Coordenada crossUpLeft() {
		return new Coordenada( this.numero+1,(char)(this.letra-1));
	}

	public Coordenada crossDownRight() {
		return new Coordenada(this.numero-1,(char)(this.letra+1));
	}

	public Coordenada crossDownLeft() {
		return new Coordenada( this.numero-1,(char)(this.letra-1));
	}

}
