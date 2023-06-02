package controller;

import util.Teclado;

public class LacoTesteInicio {

	/*
	 * Algoritmo para pedir a leitura de um valor para a variável x, multiplicar
	 * este valor por 3, colocar o valor obtido na variável r, e apresentar o valor
	 * de r, repetindo a sequência cinco vezes.
	 */

	public static void main(String[] args) {

		int x, r, cont = 1;

		while (cont <= 5) {
			x = Teclado.lerInt("Digite um valor: ");
			r = x * 3;
			System.out.println(x + " x 3 = " + r);
			cont++;
		}//fim do while 

	}// fim do método main

}// fim da classe
