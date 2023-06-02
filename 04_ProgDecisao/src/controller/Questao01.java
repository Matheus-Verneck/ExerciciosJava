package controller;

import util.Teclado;

public class Questao01 {
	
	/*
	 * Desenvolver um programa que pergunte um número. Se este número for 
	 * maior que 20, então ele deverá exibir a metade deste número, senão, 
	 * ele deverá exibir o número sem alterações.
	 */

	public static void main(String[] args) {
		
		double numero;
		
		numero = Teclado.lerDouble("Informe um número:");
		
		if ( numero > 20 ) {
			System.out.println("A metade de " + numero + " é " + (numero / 2));
		} else {
			System.out.println("Número sem alterações: " + numero);
		}
		

	}

}







