package controller3;

import util.Teclado;

public class LacoVariavelControle {

	/*
	 * Algoritmo para pedir a leitura de um valor para a variável x, multiplicar
	 * este valor por 3, colocar o valor obtido na variável r, e apresentar o valor
	 * de r, repetindo a sequência cinco vezes.
	 */

	public static void main(String[] args) {

		int x, r;

		for (int cont = 1; cont <= 5; cont++) {
			x = Teclado.lerInt("Informe um número: ");
			r = x * 3;
			System.out.println(x + " Multiplicado por 3: " + r);
		}//fim do for

	}// fim do main

}// fim da classe
