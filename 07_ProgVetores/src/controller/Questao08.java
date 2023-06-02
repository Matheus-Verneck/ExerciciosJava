package controller;

import util.Teclado;

public class Questao08 {

	/*
	 * Desenvolver um programa que armazene nome e nota das PR1 e PR2 de 15 alunos,
	 * calcule e armazene a média, armazene também a situação do aluno (AP ou RP).
	 * Exibir ao final uma listagem contendo nomes, notas, médias e situação de cada
	 * aluno.
	 */

	public static void main(String[] args) {

		double pr1[] = new double[15],
			pr2[] = new double[15],
			media[] = new double[15];
		String nome[] = new String[15],
			situacao[] = new String[15];
		
		for (int cont = 0; cont < 15; cont++) {
			nome[cont] = Teclado.lerTexto("Informe o nome do(a) aluno(a): " + (cont + 1));
			pr1[cont] = Teclado.lerDouble("Pr1 do(a) aluno(a) " + nome[cont]);
			pr2[cont] = Teclado.lerDouble("Pr2 do(a) aluno(a) " + nome[cont]);
			media[cont] = (pr1[cont] + pr2[cont]) / 2;
			
			if (media[cont] >= 7) {
				situacao[cont] = "APROVADO!";
			} else {
				situacao[cont] = "REPROVADO!";
			}//fim do if...else
			System.out.println("-------");
		}//fim do for 
		
		System.out.println("\n### B O L E T I M ###\n");
		
		for (int cont = 0; cont < 15; cont++) {
			//colocar nomes, notas e situações dos alunos com sysout
		}
		
	}//fim do main

}//fim da classe
