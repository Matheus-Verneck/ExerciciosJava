package controller;

public class Questao04 {

	/*
	 * Desenvolver um programa que apresente o valor da soma dos cem primeiros
	 * números inteiros (1 + 2 + 3 + 4 + ... + 97 + 98 + 99 + 100)
	 */

	public static void main(String[] args) {
		
		int contador = 1, acumulador = 0;
		
		while ( contador <= 100 ) {
			acumulador += contador;
			contador ++;  //contador = contador + 1;
		}//fim do while
		
		System.out.println("A soma dos cem primeiros números inteiros é " + acumulador);
		
	}

}
