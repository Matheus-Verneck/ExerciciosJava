package controller;

import util.Teclado;

public class Questao08 {

	/*
	 * Desenvolver um programa que pergunte um número inteiro qualquer e verifique
	 * se ele está na faixa de 1 a 10
	 */

	public static void main(String[] args) {

		int n = Teclado.lerInt("Informe um número: ");
		
		if (n <= 10 && n >= 1) {
			System.out.println("O número está entre 1 a 10.");
		} else {
			System.out.println("O número NÃO está na faixa de 1 a 10.");
		}//fim do if...else 
		
	}//fim do main

}//fim da classe 
