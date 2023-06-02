package controller;

import util.Teclado;

public class DesvioCondicionalEncadeado {

	/*
	 * Elaborar um programa que calcule o reajuste de salário de um funcionário, sob
	 * as seguintes condições: 
	 * - Reajuste de 15% se salário menor que R$ 500,00.
	 * - Reajuste de 10% se salário entre R$ 500,00 e R$ 1000,00. 
	 * - Reajuste de 5% se salário acima de R$ 1000,00.
	 */

	public static void main(String[] args) {
		
		double salario, aumento, salFinal;
		
		salario = Teclado.lerDouble("Informe o seu salário: ");
		
		if ( salario < 500 ) {
			System.out.println("Salário menor que R$ 500,00");
			aumento = salario * 15 / 100;
			salFinal = salario + aumento;
			System.out.println("Salário final: R$ " + salFinal);
		} else {
			//testando se está entre 500 e 1000:
			if ( salario <= 1000  ) {
				System.out.println("Salário está entre R$ 500,00 e 1000,00");
				aumento = salario * 10 / 100;
				salFinal = salario + aumento;
				System.out.println("Salário final: R$ " + salFinal);
			} else {
				System.out.println("Salário acima de R$ 1000,00");
				aumento = salario * 5 / 100;
				salFinal = salario + aumento;
				System.out.println("Salário final: R$ " + salFinal);
			} // fim do if 1000 ..else 
		}// fim do if 500 ..else 

	} // fim do método main

} // fim da classe






