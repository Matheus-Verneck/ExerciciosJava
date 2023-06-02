package controller;

import util.Teclado;

public class ExemploMatriz {

	/*
	 * Fazer uma matriz com 3 linhas e 4 colunas e preencher com valores inseridos
	 * pelo usuário. Ao final, exibir todos os valores inseridos na matriz
	 */

	public static void main(String[] args) {

		
		int mat[][] = new int[3][4];
		
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				mat[linha][coluna] = Teclado.lerInt("Infomrme um número para mat[" + linha + "][" + coluna + "]");
			}//fim do for coluna
		}//fim do for linha
		
		System.out.println("--- EXIBINDO TODA MATRIZ ---");
		
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				System.out.print(mat[linha][coluna] + " ");
			}//fim do for coluna
			System.out.println();
		}//fim do for linha
		
	}// fim do main

}// fim da classe
