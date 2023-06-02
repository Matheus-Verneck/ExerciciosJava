package controller;

import util.Teclado;

public class Questao03 {

	/*
	 * Desenvolver um programa que pergunte um número, e apresente como resposta se
	 * o referido número é par ou é ímpar.
	 */

	public static void main(String[] args) {
		
		int numero, resto;
		numero = Teclado.lerInt("Informe um número: ");
		
		resto = numero % 2;
		
		if ( resto == 0 ) {
			System.out.println(numero + " é par!");
		} else {
			System.out.println(numero + " é ímpar!");
		}

	}

}








