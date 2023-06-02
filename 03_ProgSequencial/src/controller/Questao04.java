package controller;

import util.Teclado;

public class Questao04 {

	/*
	 * Fazer um programa que pergunte um número inteiro e apresente o seu antecessor
	 * e seu sucessor.
	 */

	public static void main(String[] args) {

		int n = Teclado.lerInt("Informe um número inteiro: "), 
			ant = n - 1, 
			suc = n + 1;

		System.out.println("O antecessor de " + n + " é: " + ant + ". E o seu sucessor é: " + suc);
	}// fim do main

}// fim da classe
