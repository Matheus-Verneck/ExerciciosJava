package controller;

import util.Teclado;

public class Questao02 {

	/*
	 * Desenvolver um programa que pergunte cinco elementos de um vetor a. No final,
	 * apresente a soma de todos os elementos deste vetor.
	 */

	public static void main(String[] args) {

		int a[] = new int[5], acum = 0;
		
		for (int cont = 0; cont < 5; cont++) {
			a[cont] = Teclado.lerInt("Informe um número para salvar no índice " + cont + " do vetor a. ");
			acum += a[cont];
		}//fim do for
		
		System.out.println("A soma dos valores inseridos no vetor a é: " + acum);
		
	}//fim do main

}//fim da classe
