package controller;

import util.Teclado;

public class Questao02 {

	/*
	 * Elaborar um programa que pergunte quatro valores inteiros e apresente 2
	 * resultados: 
	 * a) Resultado de suas adições 
	 * b) Resultado de suas multiplicações
	 */

	public static void main(String[] args) {

		int n1 = Teclado.lerInt("Digite um número inteiro: "), 
			n2 = Teclado.lerInt("Digite outro número inteiro: "),
			n3 = Teclado.lerInt("Digite outro número inteiro: "),
			n4 = Teclado.lerInt("Digite outro número inteiro: "),
		soma = n1 + n2 + n3 + n4,
		multi = n1 * n2 * n3 * n4;
		
		System.out.println("a) Resultado de suas adições = " + soma);
		System.out.println("a) Resultado de suas multiplicações = " + multi);

	}//fim do main

}//fim da classe
