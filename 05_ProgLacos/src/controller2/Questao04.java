package controller2;

import util.Teclado;

public class Questao04 {

	/*
	 * Desenvolver um programa que apresente os resultados de uma tabuada de um
	 * número n qualquer a ser perguntado ao usuário (n x 1, n x 2, n x 3, ... , n x
	 * 9, n x 10)
	 */

	public static void main(String[] args) {

		int cont = 1, n = Teclado.lerInt("Informe um número: ");
		System.out.println("A seguir a tabuada de " + n + ": ");

		do {
			System.out.println(n + " x " + cont + " = " + (n * cont));
			cont++;
		} while (cont <= 10);

	}// fim do main

}// fim da classe
