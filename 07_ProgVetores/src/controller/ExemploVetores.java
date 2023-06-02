package controller;

import util.Teclado;

public class ExemploVetores {

	/*
	 * Elaborar um programa de computador que pergunte o nome 10 pessoas, e ao final
	 * apresente uma lista com os nomes informados.
	 */

	public static void main(String[] args) {

		String nomes[] = new String[10];
		
		for (int cont = 0; cont < 10; cont++) {
			nomes[cont] = Teclado.lerTexto("Informe um nome:");
		}//fim do for

		System.out.println("\n---RELAÇÃO DE PESSOAS CADASTRADAS---\n");
		
		for (int cont = 0; cont < 10; cont++) {
			System.out.println((cont + 1) + " - " + nomes[cont]);
		}//fim do for2
		
	}// fim do main

}// fim da classe



//Declararar um vetor do tipo String com 10 posições
//String nomes[] = new String[10];
//
//nomes[2] = "Ana";
//nomes[5] = "João";
//System.out.println(nomes[2] + " - " + nomes[5]);
//nomes[5] = "Rafael";
//System.out.println(nomes[2] + " - " + nomes[5]);