package controller3;

public class Questao01 {

	/*
	 * Desenvolver um programa que apresente todos os valores numéricos inteiros
	 * ímpares situados na faixa de 1000 a 1500.
	 */

	public static void main(String[] args) {

		for(int cont = 1000; cont <= 1500; cont ++ ) {
			
			if (cont % 2 == 1) {
				System.out.println(cont);
			}//fim do if
		
		}//fim do for 
		
	}//fim do main

}//fim da classe
