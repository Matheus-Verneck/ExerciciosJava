package controller;

import util.Teclado;

public class Questao03 {

	/*
	 * Fazer um programa que pergunte um valor em Dólares e apresente o equivalente
	 * em Reais. Considere U$1,00 = R$3,80.
	 */

	public static void main(String[] args) {

		double dolar = Teclado.lerDouble("Informe um valor em U$: "),
				real = dolar * 3.80;
		
		System.out.println("Esse mesmo valor em reais é: R$" + real);
		
		
	}// fim do main

}// fim da classe
