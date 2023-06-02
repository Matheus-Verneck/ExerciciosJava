package controller;

import util.Teclado;

public class DesvioCondicionalEncadeado2 {

	/*
	 * Elaborar um programa que calcule o reajuste de salário de um funcionário, sob
	 * as seguintes condições: 
	 * - Reajuste de 15% se salário menor que R$ 500,00.
	 * - Reajuste de 10% se salário entre R$ 500,00 e R$ 1000,00. 
	 * - Reajuste de 5% se salário acima de R$ 1000,00.
	 */

	public static void main(String[] args) {
		
		double salario, aumento, salFinal, porcento;
		
		salario = Teclado.lerDouble("Informe o seu salário: ");
		
		if ( salario < 500 ) {
			System.out.println("Salário menor que R$ 500,00");
			porcento = 15;
		} else {
			//testando se está entre 500 e 1000:
			if ( salario <= 1000  ) {
				System.out.println("Salário está entre R$ 500,00 e 1000,00");
				porcento = 10;
			} else {
				System.out.println("Salário acima de R$ 1000,00");
				porcento = 5;
			} // fim do if 1000 ..else 
		}// fim do if 500 ..else 
		
		aumento = salario * porcento / 100;
		salFinal = salario + aumento;
		System.out.println("Salário final: R$ " + salFinal);

	} // fim do método main

} // fim da classe






