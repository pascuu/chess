package Ficha;

import Ficha.Ficha.Shape;

public class Test {
	
	

	public static void main(String[] args) {
//		Ficha a=new Ficha(Ficha.Shape.White_Queen);
//		Ficha b=new Ficha(Ficha.Shape.White_King);
//		Ficha c=new Ficha(Ficha.Shape.White_Horse);
//		Ficha d=new Ficha(Ficha.Shape.White_Rock);
//		Ficha e=new Ficha(Ficha.Shape.White_Bishop);
//		Ficha f=new Ficha(Ficha.Shape.White_Pawn);
//		Ficha a1=new Ficha(Ficha.Shape.Black_Queen);
//		Ficha b1=new Ficha(Ficha.Shape.Black_King);
//		Ficha c1=new Ficha(Ficha.Shape.Black_Horse);
//		Ficha d1=new Ficha(Ficha.Shape.Black_Rock);
//		Ficha e1=new Ficha(Ficha.Shape.Black_Bishop);
//		Ficha f1=new Ficha(Ficha.Shape.Black_Pawn);
		char letra;
		int numero;
		Tablero t=new Tablero();
		Coordenada c=new Coordenada(5,'A');
		Coordenada c2= new Coordenada(7,'A');
//		//t.ponerPiezas();
//		System.out.println("Introduce la coordenada Y (A-H)");
//		fila = sc.next().toUpperCase().charAt(0);
//		fila = (char) fila;
//		fila = fila - 'A';
		
		
		t.celdas[7][0].setFicha(new Rock(t, Ficha.Color.Negro));
		//t.celdas[7][0].movementRock(c);
		//movementRock(c);
		
		
		System.out.println(t.getFicha(c2));
		t.getFicha(c2).moveTo(c2,c);
		
//	
//		System.out.println(a.toString());
//		System.out.println(b.toString());
//		System.out.println(c.toString());
//		System.out.println(d.toString());
//		System.out.println(e.toString());
//		System.out.println(f.toString());
//		System.out.println(a1.toString());
//		System.out.println(b1.toString());
//		System.out.println(c1.toString());
//		System.out.println(d1.toString());
//		System.out.println(e1.toString());
//		System.out.println(f1.toString());
		
		System.out.println(t.toString());
		
		
	
		
		
		
		
	}


}
