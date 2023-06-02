package controller;

import util.Teclado;

public class DesvioCondicionalComposto {
	
	/*
	 * Faça um algoritmo para perguntar dois números ao usuário, 
	 * em seguida realize a soma dos número e apresente o resultado 
	 * SE A SOMA FOR MAIOR QUE 10. Não sendo, informe apenas que a soma
	 * gerou valores baixos e que não serão apresentados.
	 */

	public static void main(String[] args) {
		
		int num1, num2, soma;
		
		num1 = Teclado.lerInt("Informe o primeiro número:");
		num2 = Teclado.lerInt("Informe o segundo número:");
		
		soma = num1 + num2;
		
		if ( soma > 10 ) {
			System.out.println("A soma dos valores inseridos é " + soma);
		} else {
			System.out.println("A soma gerou valores baixos e não serão apresentados");
		}//fim do if..else
		
		
		if ( soma > 1000 ) {
			System.out.println("Caramba!!! Valor alto demais");
		}
		
		System.out.println("FIM DA EXECUÇÃO");

	}

}






