package controller;

import util.Teclado;

public class Questao05 {

	/*
	 * Fazer um programa que pergunte o salário de um funcionário e apresente este
	 * salário com um aumento de 15%
	 */

	public static void main(String[] args) {

		double salario = Teclado.lerDouble("Informe o seu salário: "),
				aumento = salario * 15 / 100;
		
		salario += aumento;
		System.out.println("O seu salário com um aumento de 15%, ficou: " + salario);
		
	}// fim do main

}// fim da classe
