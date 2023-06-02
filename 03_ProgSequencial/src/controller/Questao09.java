package controller;

import util.Teclado;

public class Questao09 {

	/*
	 * Fazer um algoritmo que pergunte 1 número e apresente: 
	 * a) O próprio número 
	 * b) O quadrado deste número 
	 * c) A raiz quadrada deste número
	 */

	public static void main(String[] args) {

		double n = Teclado.lerDouble("Informe um número: "),
			quadrado = Math.pow(n, 2),
			raiz = Math.sqrt(n); 
		
		System.out.println("a) " + n);
		System.out.println("b) " + quadrado);
		System.out.println("c) " + raiz);
		
	}//fim do main

}//fim da classe 
