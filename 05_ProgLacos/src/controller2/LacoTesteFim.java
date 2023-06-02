package controller2;

import util.Teclado;

public class LacoTesteFim {
	
	/*
	 * Algoritmo para pedir a leitura de um valor para a variável x, multiplicar
	 * este valor por 3, colocar o valor obtido na variável r, e apresentar o valor
	 * de r, repetindo a sequência cinco vezes.
	 */

	public static void main(String[] args) {
		
		int x, r, contador;
		
		contador = 1;
		
		do {
			x = Teclado.lerInt("Informe um número: ");
			r = x * 3;
			System.out.println(x + " multiplicado por 3 = " + r);
			contador = contador + 1;
		} while ( contador <= 5 );
		

	}

}






