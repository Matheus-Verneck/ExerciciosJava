package controller;

import util.Teclado;

public class Questao03 {

	/*
	 * Desenvolver um programa que pergunte cinco elementos de um vetor a. No final,
	 * apresente a soma de todos os elementos que sejam ímpares.
	 */

	public static void main(String[] args) {
	
		int a[] = new int[5], acum = 0;
		
		for (int cont = 0; cont < 5; cont++) {
			a[cont] = Teclado.lerInt("Informe um número para salvar no índice " + cont + " do vetor a. ");
			
		if (a[cont] % 2 == 1) {
			acum += a[cont];
			}//fim do if			
		}//fim do for
		
		System.out.println("A soma dos valores IMPÁRES inseridos no vetor a é: " + acum);

	}//fim do main 

}//fim da classe
