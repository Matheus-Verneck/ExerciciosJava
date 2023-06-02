package controller;

import util.Teclado;

public class Questao04 {

	/*
	 * Desenvolver um programa que crie uma matriz de 5 linhas e 2 colunas. Pergunte
	 * ao usuário números para preencher toda a matriz, e ao final, exiba a matriz
	 * inteira e a média dos números da matriz.
	 * 
	 */

	public static void main(String[] args) {

		double acum = 0, mat[][] = new double[5][2];
		
		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < 2; coluna++) {
				mat[linha][coluna] = Teclado.lerDouble("Informe um número para a matriz[" + linha + "][" + coluna + "]");
				acum += mat[linha][coluna];
			}//fim do for coluna
		}//fim do for linha
		
		System.out.println("\n--- EXIBINDO TODA MATRIZ ---\n");
		
		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < 2; coluna++) {
				System.out.print(mat[linha][coluna] + " "); 
			}//fim do for coluna
			System.out.println();
		}//fim do for linha
		
		System.out.println("Média dos números da matriz: " + acum / 10);
		
		
		
	}//fim do main

}//fim da classe
