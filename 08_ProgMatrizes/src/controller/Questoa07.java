package controller;

public class Questoa07 {

	/*
	 * Desenvolva um programa que gere e exiba a matriz abaixo: 
	 * 11 12 13 14 
	 * 15 16 17 18 
	 * 19 20 21 22
	 */

	public static void main(String[] args) {

		int cont = 11, mat[][] = new int[3][4];
		
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				mat[linha][coluna] = cont;
				System.out.print(mat[linha][coluna] + " ");
				cont++;
			}//fim do for coluna 
			System.out.println();
		}//fim do for linha
		
	}// fim do main

}// fim da classe
