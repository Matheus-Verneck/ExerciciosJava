package controller;

import util.Teclado;

public class Questao01 {

	/*
	 * Desenvolver um programa que pergunte ao usuário o seu nome completo e seu
	 * sexo. Em seguida, o programa deve apresentar os dados anteriormente
	 * informados.
	 */

	public static void main(String[] args) {

		String nome = Teclado.lerTexto("Informe o seu nome completo: "), 
			sexo = Teclado.lerTexto("Informe o seu sexo: ");
		
		System.out.println("Você informou o nome: " + nome + ". E o sexo: " + sexo);
	
	}//fim do main

}//fim da classe
