package controller;

import util.Teclado;

public class Questao07 {

	/*
	 * Fazer um algoritmo que pergunte 3 números e apresente a média aritmética
	 * entre estes 3 números
	 */

	public static void main(String[] args) {

		double n1 = Teclado.lerInt("Informe uma nota: "),
			n2 = Teclado.lerInt("Informe mais uma nota: "),
			n3 = Teclado.lerInt("Informe mais uma nota: "),
			media = (n1 + n2 + n3) / 3;
		
		System.out.println("A média aritimética entre as notas informadas é: " + media);
		
	}//fim do main

}//fim da classe
