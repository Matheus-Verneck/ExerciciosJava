package controller2;

import util.Teclado;

public class Questao08 {

	public static void main(String[] args) {

		int b = Teclado.lerInt("Diga uma base"),
		e = Teclado.lerInt("Diga um expoente"),
		cont = 1,
		potencia = 1;
	 do {
		  potencia *= b;
		 cont ++;
	 } while (cont <= e);
	 System.out.println(b + " elevado a " + e + " = " + potencia );
		 
	 
	}
		
}
