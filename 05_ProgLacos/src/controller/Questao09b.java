package controller;

public class Questao09b {

	/*
	 * Elaborar um programa que apresente no final a soma dos valores pares
	 * existentes na faixa de 0 até 500. Utilize um laço que 
	 * efetue A VARIAÇÃO DE 1 EM 1.
	 */

	public static void main(String[] args) {
		
		int cont = 0, acum = 0; //acum é uma var acumulador, pois vai somar todos os valores de outra var
		
		while ( cont <= 500 ) {
			
			if ( cont % 2 == 0 ) {
				acum = acum + cont; // acumulador
			}//fim do if
			
			cont = cont + 1; // incremento do contador
		}//fim do while
		
		System.out.println("A soma dos valores pares de 0 a 500 é " + acum);

	}

}






