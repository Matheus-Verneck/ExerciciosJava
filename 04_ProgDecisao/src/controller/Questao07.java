package controller;

import util.Teclado;

public class Questao07 {

	/*
	 * Desenvolver um programa que pergunte um valor inteiro positivo ou negativo, e
	 * exiba como resposta o módulo deste valor, ou seja, o número lido como sendo
	 * positivo
	 */

	public static void main(String[] args) {

		double n = Teclado.lerDouble("Informe um valor positivo ou negativo: "),
				modulo = n * (-1);
		
		if (n >= 0) {
			System.out.println("MÓDULO: " + n);
		} else {
			System.out.println("MÓDULO: " + modulo);
		}//fim do if...else
		
		
	}// fim do main

}// fim da classe
