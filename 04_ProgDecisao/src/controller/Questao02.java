package controller;

import util.Teclado;

public class Questao02 {

	/*
	 * Desenvolver um programa que permita ao aluno responder qual a capital do
	 * Brasil. O programa deverá exibir se a resposta está certa ou errada.
	 */

	public static void main(String[] args) {

		String capital;

		capital = Teclado.lerTexto("Informe a capital do Brasil:");

		if (capital.equals("Brasília")) {
			System.out.println("Parabéns! Você acertou");
		} else {
			System.out.println("Infelizmente você errou");
		}
	}
}
