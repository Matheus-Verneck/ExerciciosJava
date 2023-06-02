package controller;

public class Questao09 {

	/*
	 * Elaborar um programa que apresente no final a soma dos valores pares
	 * existentes na faixa de 0 até 500. Utilize um laço que efetue a variação de 2
	 * em 2.
	 */

	public static void main(String[] args) {
		
		int cont = 0, acum = 0; //acum é uma var acumulador, pois vai somar todos os valores de outra var
		
		while ( cont <= 500) {
			acum = acum + cont; // acumulador
			cont = cont + 2; // incremento do contador
		}//fim do while
		
		System.out.println("A soma dos valores pares de 0 a 500 é " + acum);

	}

}






