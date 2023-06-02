package controller;

import util.Teclado;

public class DesvioCondicionalSimples {
	
	/*
	 * Faça um algoritmo para perguntar dois números ao usuário, 
	 * em seguida realize a soma dos número e apresente o resultado 
	 * SE A SOMA FOR MAIOR QUE 10.
	 */

	public static void main(String[] args) {
		
		int num1, num2, soma; //Criando três variáveis para números inteiros
		
		num1 = Teclado.lerInt("Digite um número: ");
		num2 = Teclado.lerInt("Digite outro número: ");
		
		soma = num1 + num2;
		
		if (soma > 10) {
			System.out.println("A soma dos valores inseridos é " + soma);
		}
		
	}

}









