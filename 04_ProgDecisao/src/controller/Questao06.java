package controller;

import util.Teclado;

public class Questao06 {

	/*
	 * Desenvolver um programa que pergunte dois valores numéricos inteiros e
	 * apresente o valor da diferença entre o maior valor e o menor valor lido.
	 */

	public static void main(String[] args) {

		int n1 = Teclado.lerInt("Informe um número: "),
			n2 = Teclado.lerInt("Informe outro um número: ");
		
		if (n1 > n2) {
			System.out.println("Diferença = " + (n1 - n2));
		} else {
			System.out.println("Diferença = " + (n2 - n1));
		}//fim do if...else
		
		
	}//fim do main

}//fim da classe
