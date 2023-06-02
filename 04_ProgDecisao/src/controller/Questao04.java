package controller;

import util.Teclado;

public class Questao04 {

	/*
	 * Desenvolver um programa que pergunte um valor numérico inteiro e faça a
	 * exibição desse valor caso seja divisível por 4 e 5. Não sendo divisível por 4
	 * e 5, o programa deverá exibir a mensagem “Valor não é divisível por 4 e 5”.
	 */

	public static void main(String[] args) {
		
		int numero, div4, div5;
		numero = Teclado.lerInt("Informe um número: ");
		
		div4 = numero % 4; //% significa o resto da divisão de numero por 4
		div5 = numero % 5;
		
		if ( (div4 == 0) && (div5 == 0) ) {
			System.out.println(numero + " é divisível por 4 e 5 ao mesmo tempo");
		} else {
			System.out.println(numero + " não é divisível por 4 e 5 ao mesmo tempo");
		}

	}

}








